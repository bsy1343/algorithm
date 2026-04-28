# [Platinum II] Firm - 8308

[문제 링크](https://www.acmicpc.net/problem/8308)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 19, 맞힌 사람: 17, 정답 비율: 56.667%

### 분류

자료 구조, 트리, 세그먼트 트리, 이분 탐색, 집합과 맵, 트리를 사용한 집합과 맵, 오프라인 쿼리, 오일러 경로 테크닉

### 문제 설명

<p>In a fast developing firm, new employees are often hired. Each new employee p&nbsp;is assigned a direct superior, whose superiors (both direct and indirect) become indirect superiors of p.</p>

<p>We call the direct superior of p&nbsp;a superior of&nbsp;<em>degree</em>&nbsp;0. The superior of a superior of degree 0 has a degree equal to 1. In general, a superior of a superior of degree k&nbsp;has degree k+1. In this way, an employee is a subordinate of his immediate superior and superiors of higher degree. This defines a hierarchy of all employees, which has the founder of the company on its top.</p>

<p>The history of all employees who have joined the company since the foundation is recorded. Some employees wonder for how many subordinates they are superiors of degree k. Would you mind writing a program, which will assist them in solving this problem, so that they could go back to work?</p>

### 입력

<p>In the first line of the standard input there is an integer n&nbsp;(1 &le; n &le; 10<sup>5</sup>), denoting the number of events. The following n&nbsp;lines contain descriptions of the events, one per line, given in chronological order.</p>

<p>An event of hiring a new employee is described by a character &#39;<code>Z</code>&#39; and two integers p<sub>i</sub>&nbsp;and s<sub>i</sub>&nbsp;(2 &le; p<sub>i</sub> &le; 10<sup>5</sup>, p<sub>i</sub> &ne; p<sub>j</sub>&nbsp;for i &ne; j), which represent the numbers of the new employee and his immediate superior, respectively. s<sub>i</sub>&nbsp;is equal to the number of some employee, who is currently hired. The founder is assigned number 1.</p>

<p>A question from an employee q<sub>i</sub>&nbsp;about the number of his subordinates, for whom he is a superior of degree k<sub>i</sub>, is described by a character &#39;<code>P</code>&#39; and two integers q<sub>i</sub>&nbsp;and k<sub>i</sub>&nbsp;(1 &le; q<sub>i</sub> &le; 10<sup>5</sup>, 0 &le; k<sub>i</sub> &le; 10<sup>5</sup>).</p>

<p>Before the first event the founder was the only person working in the firm.</p>

### 출력

<p>For each question from an employee output one line to the standard output with one integer equal to the number of subordinates of this employee, for whom he is a superior of degree k<sub>i</sub>.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8308.%E2%80%85Firm/b2a5e2c5.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8308.%E2%80%85Firm/b2a5e2c5.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8308/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:132px" /></p>