# [Silver III] The Perfect Symmetry - 6694

[문제 링크](https://www.acmicpc.net/problem/6694)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 79, 정답: 31, 맞힌 사람: 24, 정답 비율: 44.444%

### 분류

수학, 자료 구조, 정렬, 기하학, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>The representatives of NATO countries must be guarded by many bodyguards during the Summit. Each V.I.P. is accompanied by his own bodyguards but is also assigned many other specialists, snipers, etc. To make their work efficient and the guarded person secure as much as possible, the bodyguards must be distributed to various directions from the person.</p>

<p>The optimal placement of bodyguards is such that the V.I.P. stands in the center of symmetry of all guards. Unfortunately, when the V.I.P. moves, it is very hard to reconfigure the bodyguards&#39; positions to reflect the new situation. Most of the Czech specialists are not able to do such reconfigurations in real-time.</p>

<p>Therefore, the Home Affairs Minister Sobeslav Gros has decided to reverse this procedure. The bodyguards take their places first. Then, it is the responsibility of the V.I.P. to find the proper position in the center of symmetry. If the person appears anywhere else, we take no responsibility for his/her security.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6694.%E2%80%85The%E2%80%85Perfect%E2%80%85Symmetry/edda6a9e.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6694/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:424px; width:365px" /></p>

<p>Your task is to automate the process. Given a set of N points (bodyguard positions), you are to find its center of symmetry S, where the V.I.P. is relatively safe. More formal description follows.</p>

<p>Let&#39;s have a point A and the center of symmetry S. We say that another point A&#39; is the image of the point A according to the center of symmetry S iff S is the center of the line joining points A and A&#39;.</p>

<p>The image of the set of points (X) according to the center S is the set of all images of individual points in that set. The set X is said to possess a center of symmetry, if there exists a point S such that the image of the set X according to the center S is equal to the set X itself.</p>

### 입력

<p>The input consists of several assignments. Each assignment begins with a line containing a single integer number N, 1 &lt;= N &lt;= 20000. It is followed by N lines, each containing two integer numbers X<sub>i</sub> and Y<sub>i</sub> separated with a space, -10<sup>5</sup> &lt;= |X<sub>i</sub>,Y<sub>i</sub>| &lt;= 10<sup>5</sup>. These are the Cartesian coordinates of the i-th point in the set.</p>

<p>Since no two bodyguards occupy the same place, no point will appear twice in the same assignment. However, note that a bodyguard can be in the same place as the V.I.P.</p>

<p>After the last assignment, there is a line containing zero instead of the number of points. This line should not be processed.</p>

### 출력

<p>For each assignment, output exactly one line. If the given set possesses a center of symmetry, print the text &quot;V.I.P. should stay at (X,Y).&quot; where X and Y are the Cartesian coordinates of the center rounded to the nearest number with exactly one digit after the decimal point.</p>

<p>If there is no center of symmetry, output the text: &quot;This is a dangerous situation!&quot;.</p>