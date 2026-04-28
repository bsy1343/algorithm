# [Gold V] Nailed It! - 14685

[문제 링크](https://www.acmicpc.net/problem/14685)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 87, 정답: 59, 맞힌 사람: 52, 정답 비율: 69.333%

### 분류

조합론, 수학

### 문제 설명

<p>Tudor is a contestant in the Canadian Carpentry Challenge (CCC). To win the CCC, Tudor must demonstrate his skill at nailing wood together to make the longest fence possible using boards. To accomplish this goal, he has N pieces of wood. The i<sup>th</sup> piece of wood has integer length L<sub>i</sub>.</p>

<p>A board is made up of exactly two pieces of wood. The length of a board made of wood with lengths L<sub>i</sub> and L<sub>j</sub> is L<sub>i</sub> + L<sub>j</sub>. A fence consists of boards that are the same length. The length of the fence is the number of boards used to make it, and the height of the fence is the length of each board in the fence. In the example fence below, the length of the fence is 4; the height of the fence is 50; and, the length of each piece of wood is shown:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14685.%E2%80%85Nailed%E2%80%85It!/b4983998.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14685.%E2%80%85Nailed%E2%80%85It!/b4983998.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14685/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:248px; width:397px" /></p>

<p>Tudor would like to make the longest fence possible. Please help him determine the maximum length of any fence he could make, and the number of different heights a fence of that maximum length could have.</p>

### 입력

<p>The first line will contain the integer N (2 &le; N &le; 1 000 000).</p>

<p>The second line will contain N space-separated integers L<sub>1</sub>, L<sub>2</sub>, . . . , L<sub>N</sub> (1 &le; L<sub>i</sub> &le; 2 000).</p>

<p>For 7 of the 15 available marks, N &le; 100.</p>

<p>For an additional 6 of the 15 available marks, N &le; 1000.</p>

<p>For an additional 1 of the 15 available marks, N &le; 100 000.</p>

### 출력

<p>Output two integers on a single line separated by a single space: the length of the longest fence and the number of different heights a longest fence could have.</p>

### 힌트

<p>Explanation for Output for Sample Input 1</p>

<p>Tudor first combines the pieces of wood with lengths 1 and 4 to form a board of length 5. Then he combines the pieces of wood with lengths 2 and 3 to form another board of length 5. Finally, he combines the boards to make a fence with length 2 and height 5.</p>

<p>Explanation for Output for Sample Input 2</p>

<p>Tudor can&rsquo;t make a fence longer than length 1, and there are 10 ways to make a fence with length 1 by choosing any two pieces of wood to nail together. Specifically, he may have a fence of height 11, 101, 1001, 2001, 110, 1010, 2010, 1100, 2100 and 3000.</p>