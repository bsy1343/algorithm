# [Platinum IV] 리그전 - 27069

[문제 링크](https://www.acmicpc.net/problem/27069)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 136, 정답: 73, 맞힌 사람: 57, 정답 비율: 54.808%

### 분류

수학, 애드 혹, 많은 조건 분기

### 문제 설명

<p><a href="https://ko.wikipedia.org/wiki/%EB%A6%AC%EA%B7%B8%EC%A0%84">리그전</a>에서는 1번 팀부터 $n$번 팀까지 총 $n$개의 팀이 다른 모든 팀과 한 번씩 맞붙는다. 경기 결과는 승리, 패배, 혹은 무승부 중 하나이고 이기면 승점 $a$점, 비기면 $b$점, 지면 $c$점을 획득한다. <strong>단, 일반적인 리그전의 승점 계산 방식과는 다르게 이 문제에서 $a, b, c$의 대소 관계는 정해져 있지 않다</strong>. 예를 들어, 이겼을 때 얻는 점수가 졌을 때 얻는 점수보다 적을 수 있다.</p>

<p>팀의 순위는 승점이 높은 순으로 정하되, 만약 승점이 같으면 팀 번호가 작은 팀이 더 높은 순위이다. 모든 경기가 끝난 뒤 $k$등 팀의 승점으로 가능한 값 중 최댓값과 최솟값을 구하는 프로그램을 작성하여라.</p>

### 입력

<p>첫 번째 줄에 테스트 케이스의 개수 $T$가 주어진다.</p>

<p>다음 $T$개의 줄에 각 줄마다 $a$, $b$, $c$, $n$, $k$가 공백을 사이에 두고 주어진다.</p>

### 출력

<p>$T$개의 줄에 각 케이스마다 $k$등 팀의 승점의 최댓값과 최솟값을 순서대로 출력한다.</p>

### 제한

<ul>
	<li>$1 \le T \le 100\,000$</li>
	<li>$0 \le a, b, c \le 10^9$</li>
	<li>$1 \le k \le n \le 10^9$</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27069.%E2%80%85%EB%A6%AC%EA%B7%B8%EC%A0%84/0d78ad97.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27069.%E2%80%85%EB%A6%AC%EA%B7%B8%EC%A0%84/0d78ad97.png" data-original-src="https://upload.acmicpc.net/133bfc04-4b53-4310-9b07-45dc1281584d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 589px; width: 700px;" /></p>