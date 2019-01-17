//leetcode 251 Flatten 2D Vector

/*
time: O()
space: O()
*/

public class Vector2D implements Iterator<Integer> {

	private Iterator<List<Integer>> i;
	private Iterator<Iterator> j;
    public Vector2D(List<List<Integer>> vec2d) {
        i = vec2d.iterator();
    }

    @Override
    public Integer next() {
        hasNext();
        return j.next();
    }

    @Override
    public boolean hasNext() {
        while((j == null || !j.hasNext()) && i.hasNext())
        	j = i.next().iterator();
        return j != null && j.hasNext();
    }
}