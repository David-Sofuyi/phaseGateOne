import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    @Test
    public void testThatFunctionExists(){
        int [] numbers ={ }
        int expected = ;
        int actual = MiniParkingLot.displayStatus(filled, available);
        assertEquals(expected , actual);
    }
    
     @Test
    public void testThatFunctionTestForEmptyParkingLot(){
        int [] numbers ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int expected = 0;
        int actual = MiniParkingLot.displayStatus(filled, available);
        assertEquals(expected , actual);
    }
    
     @Test
    public void testThatFunctionTestForFilledParkingLot(){
        int [] numbers ={2,3,5,4,4,6,3,4,7,5,7,9,1,2,6,1,4,2,4,5};
        int expected = true;
        int actual = MiniParkingLot.displayStatus(filled, available);
        assertEquals(expected , actual);
    }
    
     @Test
    public void testThatFunctionTestForAvailableParkingLot(){
        int [] numbers ={0,0,5,0,4,0,3,0,7,0,0,0,1,0,6,0,0,0,0,0};
        int expected = 1;
        int actual = MiniParkingLot.displayStatus(filled, available);
        assertEquals(expected , actual);
    }

