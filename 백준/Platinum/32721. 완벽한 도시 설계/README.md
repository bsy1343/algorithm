# [Platinum V] 완벽한 도시 설계 - 32721

[문제 링크](https://www.acmicpc.net/problem/32721)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 298, 정답: 72, 맞힌 사람: 62, 정답 비율: 27.803%

### 분류

그래프 이론, 함수형 그래프

### 문제 설명

<p>건덕이가 설립한 오리 왕국은 $1$부터 $N$까지 $N$개의 도시로 이루어져 있다. 각 도시는 자신 혹은 다른 도시로 향하는 일방통행 도로를 단 한 개만 가지고 있다. 왕국을 다스리던 건덕이는 어떤 도시에서 도로를 이용해 도달할 수 없는 도시가 존재할 수 있음을 알아챘다.</p>

<p>건덕이는 어떤 도시에서 출발하더라도 모든 도시를 방문할 수 있도록 도로를 최소한으로 수정하기로 했다. 건덕이는 도로를 아래와 같은 방법으로 수정한다.</p>

<ul>
	<li>도시 $A$에서 출발하는 도로의 목적지를 수정한다. $\left(1 \le A \le N \right)$</li>
</ul>

<p>건덕이를 위해 어떤 도시에서 출발하더라도 모든 도시를 방문할 수 있도록 만드는 도로의 최소 수정 횟수를 구해주자!</p>

### 입력

<p>첫째 줄에 도시의 개수 $N$이 주어진다. $\left(2 \le N \le 1,000,000\right)$</p>

<p>둘째 줄에 도시별로 연결된 도시 $N$개가 공백으로 구분되어 주어진다. $i$번째 값은 $i$번째 도시에서 출발하는 도로의 목적지이다. $\left(1 \le i \le N \right)$</p>

### 출력

<p>어떤 도시에서 출발하더라도 모든 도시를 방문할 수 있도록 만드는 도로의 최소 수정 횟수를 출력한다.</p>

### 힌트

<p>예제 입력 1의 예시 이미지</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32721.%E2%80%85%EC%99%84%EB%B2%BD%ED%95%9C%E2%80%85%EB%8F%84%EC%8B%9C%E2%80%85%EC%84%A4%EA%B3%84/b6feb04d.png" data-original-src="https://boja.mercury.kr/assets/problem/32721-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 291px; width: 300px;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32721.%E2%80%85%EC%99%84%EB%B2%BD%ED%95%9C%E2%80%85%EB%8F%84%EC%8B%9C%E2%80%85%EC%84%A4%EA%B3%84/e03381b7.png" data-original-src="https://boja.mercury.kr/assets/problem/32721-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 291px; width: 300px;"></p>