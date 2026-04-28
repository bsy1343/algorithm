# [Platinum II] 흔한 타일 색칠 문제 - 22359

[문제 링크](https://www.acmicpc.net/problem/22359)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 406, 정답: 187, 맞힌 사람: 159, 정답 비율: 46.491%

### 분류

구현, 해 구성하기, 분할 정복, 재귀

### 문제 설명

<p>세상엔 색칠하는 문제도, 타일을 채우는 문제도 많다. 이 문제도 그중 하나로, 변의 길이가 1인 정사각형 모양의 타일 3개를 L 모양으로 이어붙인 도형인 L-트로미노를 다룬다. L-트로미노는 회전을 포함하여 다음과 같이 4개의 모양이 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22359.%E2%80%85%ED%9D%94%ED%95%9C%E2%80%85%ED%83%80%EC%9D%BC%E2%80%85%EC%83%89%EC%B9%A0%E2%80%85%EB%AC%B8%EC%A0%9C/73b02a45.png" data-original-src="https://upload.acmicpc.net/97738e24-7289-4475-afb7-0db60fce3acf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 110px;" /></p>

<p style="text-align: center;">그림 I.1: L-트로미노</p>

<p>양의 정수 $k$에 대해 $2^k \times 2^k$ 개의 타일로 이루어진 정사각형 모양의 판을 생각해 보자. 여기서 타일 하나를 어느 위치에서 떼어내더라도, 판 위에 L-트로미노를 겹치지 않게 적절히 놓아서 남은 부분을 빈틈없이 덮을 수 있음이 알려져 있다. 이렇게 L-트로미노를 배치하는 방법은 여러 가지가 있을 수 있다.</p>

<p>이렇게 L-트로미노를 배치한 뒤, 각각의 L-트로미노에 색을 칠해서 모든 L-트로미노가 구별되도록 하려고 한다. 어떤 L-트로미노가 변을 접하는 다른 모든 L-트로미노와 색이 다를 때 L-트로미노가 구별된다고 부른다.</p>

<p>이 L-트로미노들은 한 평면 위에 놓여 있기 때문에, 유명한 4색 정리에 의해 4개의 색만을 이용하여 모든 L-트로미노가 구별되도록 칠할 수 있다. 흥미롭게도, 타일 하나를 어느 위치에서 떼어내더라도 3개 이하의 색으로 모든 L-트로미노를 구별되게 칠할 수 있는 배치가 존재한다.</p>

<p>판의 크기와 떼어낸 타일의 위치가 주어질 때, 위의 내용에 따라 L-트로미노를 배치하고 색칠하는 예시를 구해 보자.</p>

### 입력

<p>첫 번째 줄에는 총 테스트 케이스의 개수인 정수 $T$와 판의 크기를 결정하는 정수 $k$가 주어진다. ($ 1 \leq T \leq 2^{10}$, $ 1 \leq k \leq 10$)</p>

<p>$T \times 2^{2k}$는 $2^{22}$ 이하이다.</p>

<p>이후 $T$줄에 걸쳐 각 테스트 케이스마다 두 정수 $a$와 $b$가 공백으로 구분되어 주어진다. ($1 \leq a, b \leq 2^k)$</p>

### 출력

<p>각 테스트 케이스마다 $2^k$개의 줄에 걸쳐 $2^k \times 2^k$개의 타일로 이루어진 정사각형 모양의 판에서 $a$번째 가로줄의 $b$번째 타일을 떼어냈을 때의 L-트로미노 색칠 방법을 출력한다. 이 중 $i$번째 줄은 판의 $i$번째 가로줄의 배치를 의미한다. 타일의 색은 <code>a</code>, <code>b</code>, <code>c</code> 중 하나이며 떼어낸 타일은 <code>@</code>로 표현된다. 물론 변이 인접한 두 L-트로미노의 색은 같을 수 없다.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22359.%E2%80%85%ED%9D%94%ED%95%9C%E2%80%85%ED%83%80%EC%9D%BC%E2%80%85%EC%83%89%EC%B9%A0%E2%80%85%EB%AC%B8%EC%A0%9C/0e0fcc0b.png" data-original-src="https://upload.acmicpc.net/c9eb2715-0ac7-493a-b68f-abdbc1b34d08/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 120px; height: 120px;" /></p>

<p style="text-align: center;">붉은 실선으로 표시된 변에서 인접한 두 L-트로미노의 색이 같으므로 오답</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22359.%E2%80%85%ED%9D%94%ED%95%9C%E2%80%85%ED%83%80%EC%9D%BC%E2%80%85%EC%83%89%EC%B9%A0%E2%80%85%EB%AC%B8%EC%A0%9C/267806a5.png" data-original-src="https://upload.acmicpc.net/f881e1aa-bcca-4e00-8ae5-8fcd34126e58/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 240px; height: 240px;" /></p>

<p style="text-align: center;">$2^3 \times 2^3$ 판에서 $a = 7, b = 6$ 일 때 가능한 정답 중 하나</p>