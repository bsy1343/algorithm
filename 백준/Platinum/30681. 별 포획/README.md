# [Platinum II] 별 포획 - 30681

[문제 링크](https://www.acmicpc.net/problem/30681)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 398, 정답: 115, 맞힌 사람: 86, 정답 비율: 26.791%

### 분류

기하학, 볼록 껍질, 회전하는 캘리퍼스

### 문제 설명

<p>스타는 밧줄을 사용해서 별을 포획하려고 한다. 포획 과정은 다음과 같다.</p>

<ol>
	<li>밧줄로 포획하려는 모든 별을 감싼 뒤 팽팽하게 당긴다. 이때, 별과 별 사이에 걸린 밧줄의 부분은 팽팽해야 하며, 스타가 잡고 있는 밧줄 부분은 서로 평행하게 하면서 만나지 않도록 한다.
	<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30681.%E2%80%85%EB%B3%84%E2%80%85%ED%8F%AC%ED%9A%8D/6ada6784.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30681.%E2%80%85%EB%B3%84%E2%80%85%ED%8F%AC%ED%9A%8D/6ada6784.jpg" data-original-src="https://u.acmicpc.net/395fc50c-90ce-4981-b871-23f2439a5a04/step-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 80%; width: 80%;" /></p>
	</li>
	<li>1.에서 밧줄에 닿은 별들을 제외하고 나머지 별들은 밧줄에 닿지 않을 정도로만 밧줄을 잡은 채로 양손을 가까이 당긴다.
	<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30681.%E2%80%85%EB%B3%84%E2%80%85%ED%8F%AC%ED%9A%8D/54b1b841.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30681.%E2%80%85%EB%B3%84%E2%80%85%ED%8F%AC%ED%9A%8D/54b1b841.jpg" data-original-src="https://u.acmicpc.net/ef15c48f-4dbe-452f-8e0b-5a7bb0e6b45a/step-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 80%; height: 80%;" /></p>
	</li>
	<li>있는 힘껏 잡아당긴다.
	<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30681.%E2%80%85%EB%B3%84%E2%80%85%ED%8F%AC%ED%9A%8D/06590214.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30681.%E2%80%85%EB%B3%84%E2%80%85%ED%8F%AC%ED%9A%8D/06590214.png" data-original-src="https://u.acmicpc.net/568afaac-1c47-4951-83b6-449727b3d425/step-3.PNG" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 80%; height: 80%;" /></p>
	</li>
</ol>

<p>별들을 포획하다 보면 밧줄에 무리가 가서 끊어질 수 있어 밧줄의 부담을 최소화하여 별들을 포획하려고 한다. 어떻게 해야 밧줄의 부담을 줄일 수 있을지 고민하던 스타는 2.에서 별과 별 사이에 걸린 밧줄의 길이의 합이 작을수록 밧줄의 부담이 줄어든다는 것을 알아냈다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30681.%E2%80%85%EB%B3%84%E2%80%85%ED%8F%AC%ED%9A%8D/ab3bd960.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30681.%E2%80%85%EB%B3%84%E2%80%85%ED%8F%AC%ED%9A%8D/ab3bd960.png" data-original-src="https://u.acmicpc.net/a8fac211-eb66-4681-b97a-099cedab18a8/red_line.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 80%; width: 80%;" /></p>

<p>그럼, 이제 별과 별 사이에 걸린 밧줄의 길이의 합을 최소화하면 된다. 어느 정도까지 길이의 합을 줄일 수 있을지 구해보자.</p>

### 입력

<p>첫째 줄에는 포획하려는 별의 개수 $N$이 정수로 주어진다. $(2 \leq N \leq 100 \, 000)$</p>

<p>둘째 줄부터 $N$개의 줄에 걸쳐 각 별들의 위치 $x_i, y_i$ 가 공백을 사이에 두고 한 줄에 하나씩 주어진다. $x_i, y_i$는 정수이다. 같은 위치에 두 개 이상의 별이 존재하는 경우는 없다. $(-3 \, 000 \, 000 \leq x_i, y_i \leq 3 \, 000 \, 000)$</p>

### 출력

<p>별과 별 사이에 걸린 밧줄 길이의 최솟값을 출력한다.</p>

<p>절대/상대 오차는 $10^{-6}$까지 허용한다.</p>