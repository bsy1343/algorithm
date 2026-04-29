# [Platinum III] 사발 - 2005

[문제 링크](https://www.acmicpc.net/problem/2005)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 74, 정답: 26, 맞힌 사람: 17, 정답 비율: 32.075%

### 분류

브루트포스 알고리즘, 많은 조건 분기, 다이나믹 프로그래밍, 기하학, 수학, 재귀

### 문제 설명

<p>밑면이 반지름이 r인 원이고 윗면이 반지름이 R인 사발이 있다. (윗면을 뚫려있다) 그리고 옆면이 직선이다. N개의 사발이 주어져 있을 때, 이 사발을 적절한 순서로 쌓을 때 최소 높이를 구하는 프로그램을 작성하시오. (단 사발의 두께는 무시하는 걸로 하자)</p>

<p>사발의 쌓는 모양을 그림으로 표현하면 대략 다음과 같다.</p>

<p style="text-align: center;"><img alt="" height="114" src="%EB%B0%B1%EC%A4%80/Platinum/2005.%E2%80%85%EC%82%AC%EB%B0%9C/f43cd0ab.png" data-original-src="https://boja.mercury.kr/assets/problem/2005-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="406" /></p>

### 입력

<p>첫 번째 줄에는 사발의 개수 n이&nbsp;주어진다. 그리고 두 번째 줄부터 n+1번째 줄까지 각 사발의 정보가 주어지는데 각 줄에는 h, r, R 세 개의 정수가 빈칸을 사이에 두고 차례로 주어진다. h는 높이를 의미하고, r은 밑면의 반지름, R은 윗면의 반지름을 의미한다.</p>

### 출력

<p>첫째 줄에 최소 높이를 출력한다. 결과를 버림하여 정수값으로 출력한다.</p>

### 제한

<ul>
	<li>2 &le; n &le; 9</li>
	<li>0 &lt; h, r, R &lt; 1000</li>
	<li>r &lt; R</li>
</ul>