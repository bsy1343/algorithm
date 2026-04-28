# [Gold IV] Seymour the Seal - 5143

[문제 링크](https://www.acmicpc.net/problem/5143)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 72, 정답: 48, 맞힌 사람: 30, 정답 비율: 60.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Seymour the Seal is very upset! Not only did he have to witness a huge explosion while he was minding his own business and munching on some tasty herrings (and &mdash; truth be told &mdash; some of his whiskers were even seared a little), but now he has to put up with all that black gooey stuff that burns in the eyes and makes breathing so hard. Swimming certainly used to be a lot more fun before. He has already figured out that if he travels through too much of that gooey stuff, it is really bad for him, and a few times he came close to dying. Fortunately, there are those nice people on the beach who clean him off. He definitely needs to make sure to visit them regularly enough if he is going to make it to some of his favorite herring hunting grounds. Alas, it seems like some of his herrings are now behind so much goop that he can&rsquo;t get there at all. So Seymour wants to compute how many of his herring supplies are still accessible.</p>

<p>You will be given a two-dimensional map representing Seymour&rsquo;s neighborhood. Seymour can move one square at a time horizontally or vertically (but not diagonally). Each character will show what&rsquo;s located at that point. An &lsquo;S&rsquo; denotes Seymour&rsquo;s seal colony (there will be exactly one &lsquo;S&rsquo; in the map). &lsquo;H&rsquo; means that there&rsquo;s a herring supply. &lsquo;G&rsquo; means black goop. &lsquo;P&rsquo; designates a place with one of those nice seal cleaners. Finally, a dot &lsquo;.&rsquo; denotes open water. Seymour has figured out that he can barely survive swimming through 3 squares of goop. The fourth one would kill him. If he visits one of the nice people, they will clean him completely, so he can then survive another 3, and can repeat this as often as he wants.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line contains two integers 1 &le; x,y &le; 50, the size of the map.</p>

<p>This is followed by y lines of x characters each, describing one row of Seymour&rsquo;s map as explained above.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on the next line, output the total number of herring supplies that Seymour can still reach without dying along the way. Each data set should be followed by a blank line.</p>