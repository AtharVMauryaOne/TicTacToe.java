System.out.print("Enter position (1-9): ");
int pos = sc.nextInt();

// Validate input
if(pos < 1 || pos > 9) {
    System.out.println("Invalid position!");
}

// Convert to row & column
int row = (pos - 1) / 3;
int col = (pos - 1) % 3;

// Place move
board[row][col] = player;
