# [Platinum III] Fair Fight - 27779

[문제 링크](https://www.acmicpc.net/problem/27779)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 8, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

이분 탐색, 자료 구조, 세그먼트 트리, 희소 배열

### 문제 설명

<p>En garde! Charles and Delila are about to face off against each other in the final fight of the Swordmaster fencing tournament.</p>

<p>Along one wall of the fencing arena, there is a rack with <b>N</b> different types of swords; the swords are numbered by type, from 1 to <b>N</b>. As the head judge, you will pick a pair of integers (L, R) (with 1 &le; L &le; R &le; <b>N</b>), and only the L-th through R-th types of swords (inclusive) will be available for the fight.</p>

<p>Different types of sword are used in different ways, and being good with one type of sword does not necessarily mean you are good with another! Charles and Delila have skill levels of <b>C<sub>i</sub></b> and <b>D<sub>i</sub></b>, respectively, with the i-th type of sword. Each of them will look at the types of sword you have made available for this fight, and then each will choose a type with which they are most skilled. If there are multiple available types with which a fighter is equally skilled, and that skill level exceeds the fighter&#39;s skill level in all other available types, then the fighter will make one of those equally good choices at random. Notice that it is possible for Charles and Delila to choose the same type of sword, which is fine &mdash; there are multiple copies of each type of sword available.</p>

<p>The fight is <i>fair</i> if the absolute difference between Charles&#39;s skill level with his chosen sword type and Delila&#39;s skill level with her chosen sword type is at most <b>K</b>. To keep the fight exciting, you&#39;d like to know how many different pairs (L, R) you can choose that will result in a fair fight.</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each case begins with a line containing the two integers <b>N</b> and <b>K</b>, as described above. Then, two more lines follow. The first of these lines contains <b>N</b> integers <b>C<sub>i</sub></b>, giving Charles&#39; skill levels for each type of sword, as described above. Similarly, the second line contains <b>N</b> integers <b>D<sub>i</sub></b>, giving Delila&#39;s skill levels.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is the number of choices you can make that result in a fair fight, as described above.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
	<li>0 &le; <b>K</b> &le; 10<sup>5</sup>.</li>
	<li>0 &le; <b>C<sub>i</sub></b> &le; 10<sup>5</sup>, for all i.</li>
	<li>0 &le; <b>D<sub>i</sub></b> &le; 10<sup>5</sup>, for all i.</li>
</ul>

### 힌트

<p>In Sample Case #1, the fight is fair if and only if Charles can use the last type of sword, so the answer is 4.</p>

<p>In Sample Case #2, there are 4 fair fights: (1, 2), (1, 3), (2, 2), and (2, 3). Notice that for pairs like (1, 3), Charles and Delila both have multiple swords they could choose that they are most skilled with; however, each pair only counts as one fair fight.</p>

<p>In Sample Case #3, there is 1 fair fight: (1, 1).</p>

<p>In Sample Case #4, there are no fair fights, so the answer is 0.</p>

<p>In Sample Case #5, remember that the <i>duelists</i> are not trying to make the fights fair; they choose the type of sword that they are most skilled with. For example, (1, 3) is not a fair fight, because Charles will choose the first type of sword, and Delila will choose the third type of sword. Delila will not go easy on Charles by choosing a weaker sword!</p>

<p>In Sample Case #6, there are 7 fair fights: (1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4), and (4, 4).</p>