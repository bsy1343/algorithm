# [Platinum V] Equal Angles - 4094

[문제 링크](https://www.acmicpc.net/problem/4094)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 6, 정답 비율: 42.857%

### 분류

기하학, 이분 탐색

### 문제 설명

<p>The All-Equal company has been tasked with placing towers on triangular plots so that the angles formed between the towers and the sides of the plots are equal. Given a triangle defined by points A, B and C, there are two such points - call them P and Q. There is one where angles PAB = PBC = PCA, and one where angles QBA = QCB = QAC.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4094.%E2%80%85Equal%E2%80%85Angles/7abc057e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4094.%E2%80%85Equal%E2%80%85Angles/7abc057e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4094/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:184px; width:591px" /></p>

### 입력

<p>There will be several test cases in the input. Each test case will consist of six integers on a single line:</p>

<pre>
AX AY BX BY CX CY</pre>

<p>Each integer will be in the range from -100 to 100. These integers represent the three points of the triangle: (AX,AY), (BX,BY) and (CX,CY). The points are guaranteed to form a triangle: they will be distinct, and will not all lie on the same line. The input will end with a line with six 0s.&nbsp;</p>

### 출력

<p>For each test case, output four space-separated real numbers:</p>

<pre>
PX PY QX QY</pre>

<p>Where (PX,PY) and (QX,QY) are the requested points. Print each real number with exactly two decimal places, rounded, and put a single space between them. Print no blank lines between outputs.</p>