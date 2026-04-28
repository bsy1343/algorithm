# [Platinum V] Welcome Party - 18602

[문제 링크](https://www.acmicpc.net/problem/18602)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 106, 정답: 25, 맞힌 사람: 18, 정답 비율: 26.471%

### 분류

그리디 알고리즘, 정렬, 슬라이딩 윈도우

### 문제 설명

<p>The annual welcome party of the Department of Computer Science and Technology is coming soon! Many students have been invited to the party, and every one of them can choose to either sing a song or play crosstalk. This troubles the chief director a lot: how to arrange the performances so that every student shows up on the stage, and the satisfaction for the audience is maximized?</p>

<p>To cope with this problem, the director proposed a model. In this model, every student has two attributes: singing ability and crosstalking ability. The value of audience satisfaction by singing is the maximum singing ability among all students that choose to sing a song. Similarly, the value of audience satisfaction by crosstalking is the maximum crosstalking ability among all students that choose to play crosstalk. The strange thing is, the overall satisfaction value of the whole party is negatively related to the absolute difference between the satisfaction values by singing and crosstalking. The problem is, what is the minimum possible absolute difference between the satisfaction values of the two types of performance?</p>

<p>Note that:</p>

<ul>
	<li>every student should choose exactly one type of performance to play;</li>
	<li>at least one student should sing a song, and at least one student should play crosstalk.</li>
</ul>

### 입력

<p>The first line of input consists of a single integer T (1 &le; T &le; 70), the number of test cases.</p>

<p>Each test case starts with a line containing a single integer n (2 &le; n &le; 100 000), denoting the number of students invited to the party. Then follow n lines, each containing two integers x and y (0 &le; x, y &le; 10<sup>18</sup>), denoting the singing ability and crosstalking ability of a student.</p>

<p>It is guaranteed that the sum of n over all test cases never exceeds 1 000 000.</p>

### 출력

<p>For each test case, output a single integer: the minimum possible absolute difference between the satisfaction values of the two types of performance.</p>