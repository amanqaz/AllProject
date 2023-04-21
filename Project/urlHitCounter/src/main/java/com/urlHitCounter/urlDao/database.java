package com.urlHitCounter.urlDao;

import org.springframework.stereotype.Repository;

@Repository
public class database {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count+1;
    }

    public String  hitCount() {
        setCount(count);
        return "Today No. of User visited  "+count+"  you getting Hits increase";
    }
}
