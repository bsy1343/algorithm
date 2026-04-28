# [Silver IV] Moo Sick - 5930

[문제 링크](https://www.acmicpc.net/problem/5930)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 230, 정답: 166, 맞힌 사람: 143, 정답 비율: 73.711%

### 분류

구현, 브루트포스 알고리즘, 정렬

### 문제 설명

<p>Everyone knows that cows love to listen to all forms of music.  Almost all forms, that is -- the great cow composer Wolfgang Amadeus Moozart once discovered that a specific chord tends to make cows rather ill.  This chord, known as the ruminant seventh chord, is therefore typically avoided in all cow musical compositions.</p><p>Farmer John, not knowing the finer points of cow musical history, decides to play his favorite song over the loudspeakers in the barn.  Your task is to identify all the ruminant seventh chords in this song, to estimate how sick it will make the cows.</p><p>The song played by FJ is a series of N (1 &lt;= N &lt;= 20,000) notes, each an integer in the range 1..88.  A ruminant seventh chord is specified by a sequence of C (1 &lt;= C &lt;= 10) distinct notes, also integers in the range 1..88.  However, even if these notes are transposed (increased or decreased by a common amount), or re-ordered, the chord remains a ruminant seventh chord!  For example, if &quot;4 6 7&quot; is a ruminant seventh chord, then &quot;3 5 6&quot; (transposed by -1), &quot;6 8 9&quot; (transposed by +2), &quot;6 4 7&quot; (re-ordered), and &quot;5 3 6&quot; (transposed and re-ordered) are also ruminant seventh chords.</p><p>A ruminant seventh chord is a sequence of C consecutive notes satisfying the above criteria. It is therefore uniquely determined by its starting location in the song. Please determine the indices of the starting locations of all of the ruminant seventh chords.</p>

### 입력

<ul><li>Line 1: A single integer: N.</li><li>Lines 2..1+N: The N notes in FJ&apos;s song, one note per line.</li><li>Line 2+N: A single integer: C.</li><li>Lines 3+N..2+N+C: The C notes in an example of a ruminant seventh chord.  All transpositions and/or re-orderings of these notes are also ruminant seventh chords.</li></ul>

### 출력

<ul><li>Line 1: A count, K, of the number of ruminant seventh chords that appear in FJ&apos;s song.  Observe that different instances of ruminant seventh chords can overlap each-other.</li><li>Lines 2..1+K: Each line specifies the starting index of a ruminant seventh chord (index 1 is the first note in FJ&apos;s song, index N is the last).  Indices should be listed in increasing sorted order.</li></ul>

### 힌트

<h4>Input Details</h4><p>FJ&apos;s song is 1,8,5,7,9,10.  A ruminant seventh chord is some transposition/re-ordering of 4,6,7.</p><h4>Output Details</h4><p>Two ruminant seventh chords appear in FJ&apos;s song (and these occurrences actually overlap by one note).  The first is 8,5,7 (transposed by +1 and reordered) starting at index 2, and the second is 7,9,10 (transposed by +3) starting at index 4.</p>