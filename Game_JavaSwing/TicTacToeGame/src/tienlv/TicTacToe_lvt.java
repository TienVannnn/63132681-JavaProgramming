package tienlv;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class CommonConstants {
    // khởi tạo các hằng màu sắc
    public static final Color BACKGROUND_COLOR = Color.decode("#011627");
    public static final Color X_COLOR = Color.decode("#E71D36");
    public static final Color O_COLOR = Color.decode("#2EC4B6");
    public static final Color BAR_COLOR = Color.decode("#FF9F1C");
    public static final Color BOARD_COLOR = Color.decode("#FDFFFC");

    // khởi tạo các hằng kích thước
    public static final Dimension FRAME_SIZE = new Dimension(540, 760);
    public static final Dimension BOARD_SIZE = new Dimension((int)(FRAME_SIZE.width * 0.96), (int)(FRAME_SIZE.height * 0.60));
    public static final Dimension BUTTON_SIZE = new Dimension(100, 100);
    public static final Dimension RESULT_DIALOG_SIZE = new Dimension((int)(FRAME_SIZE.width/3), (int)(FRAME_SIZE.height/6));


    // khởi tạo các hằng giá trị
    public static final String X_LABEL = "X";
    public static final String O_LABEL = "O";
    public static final String SCORE_LABEL = "X: 0 | O: 0";
}

public class TicTacToe_lvt extends JFrame implements ActionListener {
    // xScore - giá trị điểm của người chơi X
    // oScore - giá trị điểm của người chơi O
    // moveCounter - đếm số bước đi để quyết định trận đấu có hòa hay không
    private int xScore, oScore, moveCounter;

    // isPlayerOne - cờ để cho biết người chơi hiện tại có phải là người chơi x hay không
    private boolean isPlayerOne;

    private JLabel turnLabel, scoreLabel, resultLabel;
    private JButton[][] board;
    private JDialog resultDialog;

    public TicTacToe_lvt(){
        super("Tic Tac Toe (Java Swing)");
        setSize(CommonConstants.FRAME_SIZE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        getContentPane().setBackground(CommonConstants.BACKGROUND_COLOR);

        // cài đặt bảng ban đầu
        createResultDialog();
        board = new JButton[3][3];

        // người chơi x chơi trước
        isPlayerOne = true;

        addGuiComponent();
    }

    private void addGuiComponent(){
        // bar label
        JLabel barLabel = new JLabel();
        barLabel.setOpaque(true);
        barLabel.setBackground(CommonConstants.BAR_COLOR);
        barLabel.setBounds(0, 0, CommonConstants.FRAME_SIZE.width, 25);

        // turn label
        turnLabel = new JLabel(CommonConstants.X_LABEL);
        turnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        turnLabel.setFont(new Font("Dialog", Font.PLAIN, 40));
        turnLabel.setPreferredSize(new Dimension(100, turnLabel.getPreferredSize().height));
        turnLabel.setOpaque(true);
        turnLabel.setBackground(CommonConstants.X_COLOR);
        turnLabel.setForeground(CommonConstants.BOARD_COLOR);
        turnLabel.setBounds(
                (CommonConstants.FRAME_SIZE.width - turnLabel.getPreferredSize().width)/2,
                0,
                turnLabel.getPreferredSize().width,
                turnLabel.getPreferredSize().height
        );

        // score label
        scoreLabel = new JLabel(CommonConstants.SCORE_LABEL);
        scoreLabel.setFont(new Font("Dialog", Font.PLAIN, 40));
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabel.setForeground(CommonConstants.BOARD_COLOR);
        scoreLabel.setBounds(0,
                turnLabel.getY() + turnLabel.getPreferredSize().height + 25,
                CommonConstants.FRAME_SIZE.width,
                scoreLabel.getPreferredSize().height
        );

        // game board
        GridLayout gridLayout = new GridLayout(3, 3);
        JPanel boardPanel = new JPanel(gridLayout);
        boardPanel.setBounds(0,
                scoreLabel.getY() + scoreLabel.getPreferredSize().height + 35,
                CommonConstants.BOARD_SIZE.width,
                CommonConstants.BOARD_SIZE.height
        );

        // Tạo ra bảng gồm các ô
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                JButton button = new JButton();
                button.setFont(new Font("Dialog", Font.PLAIN, 180));
                button.setPreferredSize(CommonConstants.BUTTON_SIZE);
                button.setBackground(CommonConstants.BACKGROUND_COLOR);
                button.addActionListener(this);
                button.setBorder(BorderFactory.createLineBorder(CommonConstants.BOARD_COLOR));


                // add button to board
                board[i][j] = button;
                boardPanel.add(board[i][j]);
            }

        }

        // reset button
        JButton resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Dialog", Font.PLAIN, 24));
        resetButton.addActionListener(this);
        resetButton.setBackground(CommonConstants.BOARD_COLOR);
        resetButton.setBounds(
                114,
                651,
                resetButton.getPreferredSize().width,
                resetButton.getPreferredSize().height
        );

        getContentPane().add(turnLabel);
        getContentPane().add(barLabel);
        getContentPane().add(scoreLabel);
        getContentPane().add(boardPanel);
        getContentPane().add(resetButton);
        
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Frame f = new Frame();
        		if(JOptionPane.showConfirmDialog(f,"Bạn có chắc chắc muốn thoát?","Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        			System.exit(0);
        		}
        	}
        });
        btnExit.setFont(new Font("Dialog", Font.PLAIN, 24));
        btnExit.setBackground(new Color(253, 255, 252));
        btnExit.setBounds(303, 651, 95, 41);
        getContentPane().add(btnExit);

    }

    private void createResultDialog(){
        resultDialog = new JDialog();
        resultDialog.getContentPane().setBackground(CommonConstants.BACKGROUND_COLOR);
        resultDialog.setResizable(false);
        resultDialog.setTitle("Kết quả");
        resultDialog.setSize(CommonConstants.RESULT_DIALOG_SIZE);
        resultDialog.setLocationRelativeTo(this);
        resultDialog.setModal(true);
        resultDialog.getContentPane().setLayout(new GridLayout(2, 1));
        resultDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                resetGame();
            }
        });

        // giá trị kết quả
        resultLabel = new JLabel();
        resultLabel.setFont(new Font("Dialog", Font.BOLD, 18));
        resultLabel.setForeground(CommonConstants.BOARD_COLOR);
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // restart button
        JButton restartButton = new JButton("Chơi tiếp");
        restartButton.setBackground(CommonConstants.BOARD_COLOR);
        restartButton.addActionListener(this);

        resultDialog.getContentPane().add(resultLabel);
        resultDialog.getContentPane().add(restartButton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("Reset") || command.equals("Chơi tiếp")){
            // reset the game
            resetGame();

            // chỉ reset điểm khi nhấn vào ô reset
            if(command.equals("Reset"))
                xScore = oScore = 0;

            if(command.equals("Chơi tiếp"))
                resultDialog.setVisible(false);

        }else{
            // player move
            JButton button = (JButton) e.getSource();
            if(button.getText().equals("")){
                moveCounter++;

                // chỉ đánh dấu nút bằng x/o nếu nó chưa được chọn
                if(isPlayerOne){
                    // player one (x player)
                    button.setText(CommonConstants.X_LABEL);
                    button.setForeground(CommonConstants.X_COLOR);

                    // cập nhật lượt đi
                    turnLabel.setText(CommonConstants.O_LABEL);
                    turnLabel.setBackground(CommonConstants.O_COLOR);

                    // cập nhật lượt đi
                    isPlayerOne = false;
                }else {
                    // player two (o player)
                    button.setText(CommonConstants.O_LABEL);
                    button.setForeground(CommonConstants.O_COLOR);

                    // update turn label
                    turnLabel.setText(CommonConstants.X_LABEL);
                    turnLabel.setBackground(CommonConstants.X_COLOR);

                    // cập nhật lượt đi
                    isPlayerOne = true;
                }

                // kiểm tra điều kiện để chiến thắng
                if(isPlayerOne){
                    // kiểm tra nước đi cuối cùng của O có phải là nước đi thắng không
                    checkOWin();
                }{
                    // kiểm tra nước đi cuối cùng của X có phải là nước đi thắng không
                    checkXWin();
                }

                // nếu không thì gọi hàm hòa
                checkDraw();

                // cập nhật điểm sau khi kết thúc
                scoreLabel.setText("X: " + xScore + " | O: " + oScore);
            }

            repaint();
            revalidate();
        }
    }

    private void checkXWin(){
        String result = "X thắng!";

        // check rows
        for(int row = 0; row < board.length; row++){
            if(board[row][0].getText().equals("X") && board[row][1].getText().equals("X") && board[row][2].getText().equals("X")){
                resultLabel.setText(result);

                resultDialog.setVisible(true);

                xScore++;
            }
        }

        // check columns
        for(int col = 0; col < board.length; col++){
            if(board[0][col].getText().equals("X") && board[1][col].getText().equals("X") && board[2][col].getText().equals("X")){
                resultLabel.setText(result);

                resultDialog.setVisible(true);

                xScore++;
            }
        }

        // check diagonals
        if(board[0][0].getText().equals("X") && board[1][1].getText().equals("X") && board[2][2].getText().equals("X")){
            resultLabel.setText(result);

            resultDialog.setVisible(true);

            xScore++;
        }

        if(board[2][0].getText().equals("X") && board[1][1].getText().equals("X") && board[0][2].getText().equals("X")) {
            resultLabel.setText(result);

            resultDialog.setVisible(true);

            xScore++;
        }
    }

    private void checkOWin(){
        String result = "O thắng!";

        // check rows
        for(int row = 0; row < board.length; row++){
            if(board[row][0].getText().equals("O") && board[row][1].getText().equals("O") && board[row][2].getText().equals("O")){
                resultLabel.setText(result);

                resultDialog.setVisible(true);

                oScore++;
            }
        }

        // check columns
        for(int col = 0; col < board.length; col++){
            if(board[0][col].getText().equals("O") && board[1][col].getText().equals("O") && board[2][col].getText().equals("O")){
                resultLabel.setText(result);
                resultDialog.setVisible(true);
                oScore++;
            }
        }

        // check diagonals
        if(board[0][0].getText().equals("O") && board[1][1].getText().equals("O") && board[2][2].getText().equals("O")){
            resultLabel.setText(result);
            resultDialog.setVisible(true);
            oScore++;
        }

        if(board[2][0].getText().equals("O") && board[1][1].getText().equals("O") && board[0][2].getText().equals("O")) {
            resultLabel.setText(result);
            resultDialog.setVisible(true);
            oScore++;
        }
    }

    private void checkDraw(){
        // nếu nước di chuyển = 9 và không có người chơi thắng thì có nghĩa là hòa
        if(moveCounter >= 9){
            resultLabel.setText("Hòa!");
            resultDialog.setVisible(true);
        }
    }

    private void resetGame(){
        //cập nhật người chơi trở về x
        isPlayerOne = true;
        turnLabel.setText(CommonConstants.X_LABEL);
        turnLabel.setBackground(CommonConstants.X_COLOR);

        // reset lại hiển thị điểm
        scoreLabel.setText(CommonConstants.SCORE_LABEL);

        // reset bước di chuyển về 0
        moveCounter = 0;

        // cập nhật lại các button về rỗng để chơi trận khác
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j].setText("");
            }
        }
    }
    
    public static void main(String[] args) {
    	new TicTacToe_lvt().setVisible(true);
    }
}

