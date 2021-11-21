package clean.code.의미있는이름;

import java.util.ArrayList;
import java.util.List;

public class 의도를_분명히_밝혀라 {

    /**
     * int d; -> 경과 시간(단위: 날짜)
     * 이름 d는 아무 의미도 드러나지 않는다. 경과 시간이나 날짜라는 느낌이 안 든다.
     * 측정하려는 값과 단위를 표현하는 이름이 필요하다.
     */
    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDats;

    /**
     * 코드가 하는 일을 집작하기 어렵다.
     */
    public List<int[]> getThem() {

        ArrayList<int[]> list1 = new ArrayList<int[]>();

        for (int[] x : list1) {
            if (x[0] == 4)
                list1.add(x);
        }
        return list1;
    }

    /**
     * 코드의 단순성은 변하지 않았지만, 코드는 더욱 명확해졌다. (의미있는이름의 중요성)
     */
    private final int STATUS_VALUE = 0;
    private final int FLAGGED = 4;

    public List<int[]> getFlaggedCells() {

        ArrayList<int[]> flaggedCells = new ArrayList<int[]>();

        for (int[] cell : flaggedCells) {
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        }
        return flaggedCells;
    }

    /**
     * 좀 더 객체 지향적인 설계
     */
    public List<Cell> getFlaggedCellsObject() {
        ArrayList<Cell> flaggedCells = new ArrayList<Cell>();

        for (Cell cell : flaggedCells) {
            if (cell.isFlagged())
                flaggedCells.add(cell);
        }
        return flaggedCells;
    }

    /**
     * Cell 객체
     */
    class Cell {

        private final int STATUS_VALUE = 0;
        private final int FLAGGED = 4;
        int[] cell;

        public boolean isFlagged() {
            if (cell[STATUS_VALUE] == FLAGGED)
                return true;
            else
                return false;
        }
    }
}

