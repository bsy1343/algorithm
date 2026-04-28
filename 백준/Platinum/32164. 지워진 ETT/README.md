# [Platinum IV] 지워진 ETT - 32164

[문제 링크](https://www.acmicpc.net/problem/32164)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 71, 정답: 34, 맞힌 사람: 31, 정답 비율: 46.269%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>ETT-배열을 루트가 $1$인 트리를 다음과 같이 왼쪽 자식 우선으로 깊이 우선 순회하면서 진입 시점, 진출 시점에 맞춰 정점 번호를 순서대로 기록한 배열이라고 하자. 단, 리프 노드의 경우에도 진입 시점과 진출 시점에 모두 기록하므로, 노드가 $n$개인 트리에 대응되는 모든 ETT-배열은 길이가 $2n$이다.</p>

<p style="text-align:center;"><img alt="그림의 트리를 순회하여 기록한 ETT-배열은 [1, 2, 2, 3, 3, 4, 4, 1]임" height="342" src="%EB%B0%B1%EC%A4%80/Platinum/32164.%E2%80%85%EC%A7%80%EC%9B%8C%EC%A7%84%E2%80%85ETT/d85eb7f2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/32164.%E2%80%85%EC%A7%80%EC%9B%8C%EC%A7%84%E2%80%85ETT/d85eb7f2.png" data-original-src="https://upload.acmicpc.net/8be29503-d910-4324-a7b4-8b13c7fc9c01/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="388" /></p>

<p style="text-align:center;"><small>위 트리를 순회하여 기록한 ETT-배열은 $[1,3,2,2,3,4,4,1]$이다.</small></p>

<p>$0$ 이상 $n$ 이하의 정수로 이루어진 길이가 $2n$인 배열이 주어질 때, 배열 속 모든 $0$을 $1$ 이상 $n$ 이하의 정수로 바꾸어서 만들 수 있는 모든 ETT-배열의 개수를 구하여라.</p>

### 입력

<p>첫 번째 줄에 $n$이 주어진다. ($1\le n\le 200$)</p>

<p>두 번째 줄에 배열을 나타내는 정수 $a_1$, $a_2$, $\cdots$, $a_{2n}$이 공백으로 구분되어 주어진다. ($0\le a_i\le n$; $a_1=a_{2n}=1$)</p>

<p>주어지는 배열로 적어도 하나의 ETT-배열을 만들 수 있다.</p>

### 출력

<p>답을 $998\,244\,353$으로 나눈 나머지를 출력한다.</p>