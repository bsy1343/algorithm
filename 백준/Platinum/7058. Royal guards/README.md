# [Platinum II] Royal guards - 7058

[문제 링크](https://www.acmicpc.net/problem/7058)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 156, 정답: 56, 맞힌 사람: 48, 정답 비율: 35.556%

### 분류

이분 매칭

### 문제 설명

<p>Once upon a time, there was a kingdom. It had everything a kingdom needs, namely a king and his castle. The ground-plan of the castle was a rectangle that was divided into M &times; N unit squares. Some of the squares are walls, some of them are free. We will call each of the free squares a room. The king of our kingdom was extremely paranoid, so one day he decided to make hidden pits (with alligators at the bottom) in some of the rooms.</p>

<p>But this was still not enough. One week later, he decided to place as many guards as possible inside his castle. However, this won&rsquo;t be so simple. The guards are trained so that immediately after they see someone, they shoot at him. And so the king has to place the guards carefully, because if two guards would see each other, they would shoot at themselves! Also evidently the king can&rsquo;t place a guard into a room with a pit.</p>

<p>Two guards in a room see each other, so each room may contain at most one guard. Two guards in different rooms see each other if and only if the squares corresponding to their rooms are in the same row or in the same column of the plan of the castle and there is no wall between them. (The guard can see only in four directions, much like a rook in chess.)</p>

<p>Your task is to find out, how many guards can the king place inside his castle (according to the rules above) and to find one possible assignment of that many guards into the rooms.</p>

### 입력

<p>The first line of the input file contains two numbers M, N (1 &le; M, N &le; 200) &ndash; the dimensions of the ground-plan of the castle. The i-th of the following M lines contains N numbers a<sub>i,1</sub>, . . . , a<sub>i,N</sub>, separated by single spaces, where:</p>

<ul>
	<li>a<sub>i,j</sub> = 0 means that the square [i, j] is free (a room without a pit)</li>
	<li>a<sub>i,j</sub> = 1 means that the square [i, j] contains a pit</li>
	<li>a<sub>i,j</sub> = 2 means that the square [i, j] is a wall</li>
</ul>

<p>Note that the first coordinate of a square is the row and the second one is the column.</p>

### 출력

<p>The first line of the output file should contain the maximum number K of guards the king may place inside his castle. The following K lines should contain one possible assignment of K guards into the free rooms of the castle so that no two guards would see each other.</p>

<p>More precisely, the i-th of these lines should contain two integers r<sub>i</sub>, c<sub>i</sub> separated by a single space &ndash; the coordinates of the room where i-th guard will be placed (r<sub>i</sub> is the row and c<sub>i</sub> is the column).</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7058.%E2%80%85Royal%E2%80%85guards/823d26f5.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7058/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:123px; width:387px" /></p>

<p style="text-align: center;">Castle from the example input and one possible correct output.</p>