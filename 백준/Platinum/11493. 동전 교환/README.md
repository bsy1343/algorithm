# [Platinum I] 동전 교환 - 11493

[문제 링크](https://www.acmicpc.net/problem/11493)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 256 MB

### 통계

제출: 2372, 정답: 852, 맞힌 사람: 499, 정답 비율: 33.423%

### 분류

그래프 이론, 최대 유량, 최소 비용 최대 유량

### 문제 설명

<p>V의 집합과 간선 E의 집합으로 이루어진 양방향 그래프 G = ( V, E )가 주어진다. 이 그래프는 연결 그래프이다. 즉, 모든 정점쌍 간에 적어도 하나 이상의 경로가 존재한다. 각각의 정점들은 검정색 또는 흰색이다. 동전은 정점들 위에 하나씩 놓여 있는데 이 동전도 검정색 또는 흰색이다. 이 그래프에서 &#39;동전 교환&#39; 연산을 통해 인접한 정점 위에 있는 동전 2개의 위치를 서로 맞바꿀 수 있다. 아래 그림을 보면 이해 할 수 있을 것이다. (그림 1에서 네모의 색은 동전의 색깔이다.)</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11493.%E2%80%85%EB%8F%99%EC%A0%84%E2%80%85%EA%B5%90%ED%99%98/061a78fd.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11493.%E2%80%85%EB%8F%99%EC%A0%84%E2%80%85%EA%B5%90%ED%99%98/061a78fd.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11493/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display:block; height:133.973px; margin:auto; width:499px" /></p>

<p style="text-align: center;">그림 1. &#39;동전 교환&#39; 연산의 예 (2 &lt;&gt; 5, 5 &lt;&gt; 6, 1 &lt;&gt; 5)</p>

<p>우리가 구하고자 하는 것은 <span style="background-color:initial; font-family:arial,helvetica,verdana,tahoma,sans-serif">모든 검정색 동전을</span><span style="background-color:initial; font-family:arial,helvetica,verdana,tahoma,sans-serif"> 검정색 정점 위로, 모든 흰색 동전을</span><span style="background-color:initial; font-family:arial,helvetica,verdana,tahoma,sans-serif"> 흰색 정점 위로</span><span style="background-color:initial; font-family:arial,helvetica,verdana,tahoma,sans-serif"> 올리기 위해 필요한 &#39;동전 교환&#39; 연산의 최소 횟수이다.</span></p>

### 입력

<p>입력의 첫줄에는 테스트 케이스의 수 T가 주어진다. 각 테스트 케이스의 첫줄에는 정수 n과 m (1 &le; n &le; 500, n-1 &le; m &le; n(n-1)/2 )이 주어진다. 여기서 n은 정점의 개수, m은 간선의 개수를 나타낸다. 정점은 1 ~ n의 번호를 가진다. n, m의 다음줄부터 m 줄에 걸쳐서 인접한 두 정점 x, y (1 &le; x &lt; y &le; n)이 주어진다. 그 다음 줄에는 0 또는 1의 값을 가지는 n개의 정수가 주어진다. 여기서 i (1 &le; i &le; n)번째 정수는 정점 i의 색깔이다. 0은 검정색 1은 흰색이다. 그 다음 줄에도 0 또는 1의 값을 가지는 n개의 정수가 주어지고 여기서 i (1 &le; i &le; n)번째 정수는 정점 i위에 있는 동전의 색깔을 의미한다.</p>

### 출력

<p>한 테스트케이스당 한 줄에 걸쳐 모든 동전과 정점의 색깔을 일치시키기 위해 필요한 최소 &#39;동전 교환&#39; 연산의 횟수를 출력하라.</p>