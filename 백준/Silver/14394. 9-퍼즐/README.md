# [Silver IV] 9-퍼즐 - 14394

[문제 링크](https://www.acmicpc.net/problem/14394)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 339, 정답: 251, 맞힌 사람: 228, 정답 비율: 75.748%

### 분류

애드 혹

### 문제 설명

<p>영선이의 아이디가 nein인 이유는 숫자 9를 좋아하기 때문이다. 그런데 왜 nein일까? 영선이가 아이디를 만들 당시에 영선이는 9가 영어로 nein인줄 알았기 때문이다.</p>

<p>9를 좋아하는 영선이는 9-퍼즐이라는 게임을 만들었다. 이 게임은 변의 길이가 4인 정삼각형 보드 위에서 진행된다. 보드에는 총 10개의 칸으로 이루어져 있으며, 각 칸은 변의 길이가 1인 정삼각형이다. 칸은 0번부터 9번까지 번호가 매겨져 있으며, 아래 그림과 같다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14394.%E2%80%859-%ED%8D%BC%EC%A6%90/4e74a98a.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14394/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:249px; width:268px" /></p>

<p>9개의 칸에는 삼각형 조각이 들어있다. 각 조각은 빨간색, 초록색, 파란색, 노란색 중에 하나이다. 남은 10번째 칸은 비어있다. 이 게임의 목표는 특정한 패턴을 만드는 것이다. 그러기 위해서 영선이는 조각을 인접한 비어있는 칸으로 이동시켜야 한다. 두 칸의 중심의 거리가 1인 경우에 두 칸이 인접해 있다고 한다. 아래 그림은 올바른 이동을 하나 나타낸다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14394.%E2%80%859-%ED%8D%BC%EC%A6%90/4c6bda21.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14394/2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:244px; width:551px" /></p>

<p>현재 9-퍼즐에 색칠되어 있는 조각의 상태와 영선이가 목표로 하는 조각의 상태가 입력으로 주어진다. 하지만, 두 상태를 랜덤하게 골랐기 때문에, 게임을 풀 수 없는 경우가 나올 수도 있다. 두 패턴이 주어졌을 때, 게임을 풀 수 있게 하기 위해서 다시 색칠해야 하는 칸의 최소 개수를 구하는 프로그램을 작성하시오.&nbsp;</p>

### 입력

<p>첫째 줄에 현재 색칠되어 있는 상태와 둘째 줄에 목표로하는 상태가 주어진다. 각 상태는 길이가 10인 문자열이며, i번째 글자는 i번째 칸의 색을 나타낸다. &#39;R&#39;은 빨간색, &#39;G&#39;는 초록색, &#39;B&#39;는 파란색, &#39;Y&#39;는 노란색, &#39;*&#39;는 빈 칸을 나타낸다. 빈 칸은 항상 한 개이다.</p>

### 출력

<p>첫째 줄에 퍼즐을 풀 수 있게 만들기 위해서 다시 색칠해야 하는 칸의 최소 개수를 출력한다.</p>

### 힌트

<p>예제 1의 경우에는 다음과 같이 게임을 풀 수 있다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14394.%E2%80%859-%ED%8D%BC%EC%A6%90/dab1f941.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14394/3.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:174px; width:663px" /></p>