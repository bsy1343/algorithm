# [Platinum III] Songwriter - 19159

[문제 링크](https://www.acmicpc.net/problem/19159)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 28, 맞힌 사람: 25, 정답 비율: 52.083%

### 분류

자료 구조, 그리디 알고리즘, 스택

### 문제 설명

<p>Andi is a mathematician, a computer scientist, and a songwriter. After spending so much time writing songs, he finally writes a catchy melody that he thought as his best creation. However, the singer who will sing the song/melody has a unique vocal range, thus, an adjustment may be needed.</p>

<p>A melody is defined as a sequence of N notes which are represented by integers. Let A be the original melody written by Andi. Andi needs to adjust A into a new melody B such that for every i where 1 &le; i &lt; N:</p>

<ul>
	<li>If A<sub>i</sub> &lt; A<sub>i+1</sub>, then B<sub>i</sub> &lt; B<sub>i+1</sub>.</li>
	<li>If A<sub>i</sub> = A<sub>i+1</sub>, then B<sub>i</sub> = B<sub>i+1</sub>.</li>
	<li>If A<sub>i</sub> &gt; A<sub>i+1</sub>, then B<sub>i</sub> &gt; B<sub>i+1</sub>.</li>
	<li>|B<sub>i</sub> &minus; B<sub>i+1</sub>| &le; K, i.e. the difference between two successive notes is no larger than K.</li>
</ul>

<p>Moreover, the singer also requires that all notes are within her vocal range, i.e. L &le; B<sub>i</sub> &le; R for all 1 &le; i &le; N.</p>

<p>Help Andi to determine whether such B exists, and find the lexicographically smallest B if it exists. A melody X is lexicographically smaller than melody Y if and only if there exists j (1 &le; j &le; N) such that X<sub>i</sub> = Y<sub>i</sub> for all i &lt; j and X<sub>j</sub> &lt; Y<sub>j</sub>.</p>

<p>For example, consider a melody A = {1, 3, 5, 6, 7, 8, 9, 10, 3, 7, 8, 9, 10, 11, 12, 12} as shown in the following figure. The diagonal arrow up in the figure implies that A<sub>i</sub> &lt; A<sub>i+1</sub>, the straight right arrow implies that A<sub>i</sub> = A<sub>i+1</sub>, and the diagonal arrow down implies that A<sub>i</sub> &gt; A<sub>i+1</sub>.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19159.%E2%80%85Songwriter/4cd0a5ee.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/19159.%E2%80%85Songwriter/4cd0a5ee.png" data-original-src="https://upload.acmicpc.net/d6a452eb-7124-46c2-8eae-099d9c40ca20/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 462px; height: 253px;" /></p>

<p>Supposed we want to make a new melody with L = 1, R = 8, and K = 6. The new melody B = {1, 2, 3, 4, 5, 6, 7, 8, 2, 3, 4, 5, 6, 7, 8, 8} as shown in the figure satisfies all the requirements, and it is the lexicographically smallest possible.</p>

### 입력

<p>Input begins with a line containing four integers: N L R K (1 &le; N &le; 100 000; 1 &le; L &le; R &le; 10<sup>9</sup>; 1 &le; K &le; 10<sup>9</sup>) representing the number of notes in the melody, the vocal range (L and R), and the maximum difference between two successive notes in the new melody, respectively. The next line contains N integers: A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>9</sup>) representing the original melody.</p>

### 출력

<p>Output in a line N integers (each separated by a single space) representing the lexicographically smallest melody satisfying all the requirements, or output -1 if there is no melody satisfying all the requirements. Note that it might be possible that the lexicographically smallest melody which satisfies all the requirements to be the same as the original melody.</p>