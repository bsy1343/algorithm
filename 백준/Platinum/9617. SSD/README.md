# [Platinum IV] SSD - 9617

[문제 링크](https://www.acmicpc.net/problem/9617)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 83, 정답: 27, 맞힌 사람: 18, 정답 비율: 28.125%

### 분류

그래프 이론, 많은 조건 분기

### 문제 설명

<p>세븐 세그먼트 디스플레이는 다양한 곳에서 사용된다. 이 디스플레이는 세븐 세그먼트를 이용해서 숫자를 화면에 표시한다.</p>

<p>아래 그림은 전형적인 세븐 세그먼트 디스플레이가 사용하는 모든 세그먼트를 묘사한 그림이다. (앞으로 세븐 세그먼트 디스플레이를 SSD로 줄여서 쓴다)</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9617.%E2%80%85SSD/b9db6fe7.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/9617.%E2%80%85SSD/b9db6fe7.png" data-original-src="https://www.acmicpc.net/upload/images/ssd1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:167px; width:151px" /></p>

<p>그림 1. SSD에서 사용하는 세그먼트 (DP는 소수점을 나타낸다. 이 문제에서는 사용하지 않는다)</p>

<p>SSD에서 0부터 9까지 숫자를 표현하는 방법은 아래와 같다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9617.%E2%80%85SSD/6c3d6b36.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/9617.%E2%80%85SSD/6c3d6b36.png" data-original-src="https://www.acmicpc.net/upload/images/ssd2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:62px; width:449px" /></p>

<ul>
	<li>0은 세그먼트 A, B, C, D, E, F를 사용한다.</li>
	<li>1: B, C</li>
	<li>2: A, B, G, E, D</li>
	<li>3: A, B, C, D, G</li>
	<li>4: B, C, F, G</li>
	<li>5: A, C, D, F, G</li>
	<li>6: A, C, D, E, F, G</li>
	<li>7: A, B, C</li>
	<li>8: A, B, C, D, E, F, G</li>
	<li>9: A, B, C, D, F, G</li>
</ul>

<p>SSD에서 숫자의 표현을 그래프로 생각할 수가 있다. 세그먼트의 양 끝점을 노드로, 세그먼트를 간선으로 표현하면 숫자는 아래와 같이 나타낼 수 있다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9617.%E2%80%85SSD/78f76cb8.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/9617.%E2%80%85SSD/78f76cb8.png" data-original-src="https://www.acmicpc.net/upload/images/ssd3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:187px; width:318px" /></p>

<p>위의 그래프를 차수가 0인 SSD 그래프라고 한다. 차수가 k(k &gt; 0)인 SSD그래프는 차수가 0인 SSD 그래프의 각 간선을 k+1개의 간선으로 나누고, 그 사이에 노드 k개를 삽입해 만들 수 있다.</p>

<p>차수가 1인 SSD 그래프에서 모든 숫자를 나타내는 방법은 아래와 같다. 어두운 노드는 새로 생긴 노드이다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9617.%E2%80%85SSD/b1508821.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/9617.%E2%80%85SSD/b1508821.png" data-original-src="https://www.acmicpc.net/upload/images/ssd4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:631px; width:486px" /></p>

<p>노드 n개와 간선 m개로 이루어진 그래프가 주어진다. 입력으로 주어진 그래프가 나타낼 수 있는 숫자와 그래프의 차수를 모두 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 개수 T (1 &le; T &le; 20)가 주어진다. 각 테스트 케이스의 첫째 줄에 n (1 &le; n &le; 500)과 m (1 &le; m &le; 1000)이 주어진다. 다음 m개 줄에는 간선의 정보 (u, v)가 주어진다. 노드는 1번부터 n번까지 번호가 매겨져 있으며, 중복되는 간선이나 u와 v가 같은 간선은 입력으로 주어지지 않는다.</p>

### 출력

<p>각 테스트 케이스마다 Case X: Y를 첫째 줄에 출력한다. X는 테스트 케이스의 번호이고, Y는 가능한 (숫자, 차수) 쌍의 개수이다. 그 다음 줄부터 한 줄에 하나씩 가능한 숫자와 차수를 공백으로 구분해 출력한다. 숫자가 작은 순서대로, 같은 경우에는 차수가 작은 순서대로 출력한다. 테스트 케이스 사이에는 빈 줄을 하나 출력한다.</p>