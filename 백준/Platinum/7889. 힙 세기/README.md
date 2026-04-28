# [Platinum II] 힙 세기 - 7889

[문제 링크](https://www.acmicpc.net/problem/7889)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 141, 정답: 30, 맞힌 사람: 22, 정답 비율: 37.931%

### 분류

수학, 트리, 정수론, 조합론, 소인수분해

### 문제 설명

<p>n개의 정점으로 이루어진 루트가 있는 트리가 주어진다. 각 정점에는 1번부터 n번까지 번호가 매겨져 있다. 같은 번호를 가지는 정점은 없고, 힙을 형성하고 있다. 즉, 각 정점에 붙여있는 숫자는 부모의 정점에 붙어잇는 숫자보다 작다. 이렇게 번호를 붙이는 방법의 수를 구하는 프로그램을 작성하시오. 이 수는 매우 클 수 있기 때문에, m으로 나눈 나머지를 출력한다.</p>

### 입력

<p>입력의 첫째 줄에는 테스트 케이스의 개수 t (t &le; 250)가 주어진다. 각 테스트 케이스의 첫째 줄에는 트리의 크기 n (1 &le; n &le; 500000)과 m (2 &le; m &le; 10<sup>9</sup>)이 주어진다. 다음 n-1개 줄의 i번째 줄에는 i+1번 정점의 부모의 번호 p(i+1)가 주어진다. (1 &le; p(i+1) &le; i) 1번 정점은 항상 트리의 루트이다. 입력의 크기는 50MB를 넘지 않는다.</p>

### 출력

<p>각 테스트 케이스에 대해서, 입력으로 주어지는 조건을 만족하는 힙의 개수를 출력한다.</p>

### 힌트

<p>마지막 예제의 경우에 아래와 같이 8가지가 가능하다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7889.%E2%80%85%ED%9E%99%E2%80%85%EC%84%B8%EA%B8%B0/3dadcd23.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7889.%E2%80%85%ED%9E%99%E2%80%85%EC%84%B8%EA%B8%B0/3dadcd23.png" data-original-src="https://www.acmicpc.net/upload/images/cheap.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:207px; width:480px" /></p>