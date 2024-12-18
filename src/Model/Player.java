package Model;

public class Player {
    public String name;
    public Piece playingPiece;

    public Player(String name, Piece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece getPieceType() {
        return playingPiece;
    }

    public void setPieceType(Piece pieceType) {
        this.playingPiece = pieceType;
    }
}
