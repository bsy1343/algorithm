# [Platinum IV] 전구 끄기 - 14927

[문제 링크](https://www.acmicpc.net/problem/14927)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 1642, 정답: 950, 맞힌 사람: 664, 정답 비율: 58.042%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>홍익이는 N x N 전구 판을 가지고 있다. 전구 판에는 각 칸마다 전구가 하나씩 연결되어 있다. 이 전구 판에서 하나의 전구를 누르면, 해당 전구를 포함하여 상하좌우의 총 5개 전구들의 상태가 변화한다. 다시 말해, 5개의 전구들 중 불이 켜져 있던 전구는 불이 꺼지고, 불이 꺼져 있던 전구는 불이 켜진다.</p>

<p>예를 들어, &lt;그림1&gt; 같은 전구 판이 있다고 하자. 0은 전구가 꺼져 있는 것을 의미하고, 1은 전구가 켜져 있는 것을 의미한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14927.%E2%80%85%EC%A0%84%EA%B5%AC%E2%80%85%EB%81%84%EA%B8%B0/c5293ed6.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14927/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:207px; width:230px" /></p>

<p style="text-align: center;">&lt;그림 1&gt;</p>

<p>&lt;그림 1&gt;에서 (2, 2) 전구(회색 부분)를 눌러보면, &lt;그림 2&gt;와 같이 전구 판이 변화한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14927.%E2%80%85%EC%A0%84%EA%B5%AC%E2%80%85%EB%81%84%EA%B8%B0/13c87317.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14927/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:206px; width:228px" /></p>

<p style="text-align: center;">&lt;그림 2&gt;</p>

<p>또 다른 예로 &lt;그림 3&gt;에서 (1,1)의 전구를 눌러보면,</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14927.%E2%80%85%EC%A0%84%EA%B5%AC%E2%80%85%EB%81%84%EA%B8%B0/7d1d890f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14927/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:206px; width:229px" /></p>

<p style="text-align: center;">&lt;그림3&gt;</p>

<p>&lt;그림4&gt;와 같이 전구판의 모습이 변화한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14927.%E2%80%85%EC%A0%84%EA%B5%AC%E2%80%85%EB%81%84%EA%B8%B0/949c7f98.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14927/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:206px; width:228px" /></p>

<p style="text-align: center;">&lt;그림4&gt;</p>

<p>※ (1, 1)에서 위와 왼쪽에는 전구가 없다. 따라서 밑, 오른쪽, 그리고 자신의 전구 상태만 바뀐다.</p>

<p>홍익이는 현재 전구 판의 상태를 보고 최대한 적은 횟수로 전구들을 눌러 전구판의 모든 전구를 끄고 싶다.</p>

<p>홍익이를 도와서 전구 판의 모든 전구를 끌 수 있는 최소 횟수 B를 알아보자.</p>

<p>만약, 전구를 끌 수 있는 방법이 없다면, -1을 출력하도록 한다.</p>

### 입력

<pre>
N
0과 1로 이루어진 NxN 행렬</pre>

<ul>
	<li>2 &lt;= N &lt;= 18</li>
</ul>

### 출력

<pre>
B</pre>

### 힌트

<p>예제 1:&nbsp;(모든 전구를 다 눌러야한다.)</p>

<p>예제 2:&nbsp;(0,1), (0,2), (1,0), (2,0), (2,2)를 누르면 된다.</p>