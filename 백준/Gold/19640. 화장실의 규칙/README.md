# [Gold IV] 화장실의 규칙 - 19640

[문제 링크](https://www.acmicpc.net/problem/19640)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2077, 정답: 783, 맞힌 사람: 631, 정답 비율: 37.898%

### 분류

구현, 자료 구조, 시뮬레이션, 우선순위 큐

### 문제 설명

<p>데카는 회사의 화장실을 이용하려고 했다.&nbsp;하지만 수도 시설 고장으로 회사 내의 모든 화장실 사용이 금지됐고, 사원들은 단 하나의 임시 화장실을 이용해야 했다.&nbsp;</p>

<p>임시 화장실의 앞에 데카를 포함한&nbsp;<em>N</em>명의 사원이 대기하고 있다.&nbsp;데카는&nbsp;<em>N</em>명의 줄에서&nbsp;<em>K&nbsp;</em>+ 1번째로 줄을 섰다. 즉, 데카보다 먼저 도착한 사람이&nbsp;<em>K</em>명이 있다.&nbsp;줄이 길어지자 사장은 <em>M</em>개의 줄로 나눠서 대기하라 하였다.</p>

<p><em>N</em>명의 사원은 순서대로&nbsp;<em>M</em>개의 줄로 나눠 섰다. 기존 줄의 1번째 사원은 1번째 줄에, 2번째 사원은 2번째 줄에, ...&nbsp;<em>M</em>번째 사원은&nbsp;<em>M</em>번째 줄에, 그리고&nbsp;<em>M&nbsp;</em>+ 1번째 사원은 1번째 줄의 뒤에 서는 방식이다.&nbsp;</p>

<p><em>M</em>개의 줄로 나눠 선 것을 본 사장은 매우 흡족해하며 자리를 떠났다.</p>

<p><em>M</em>개의 줄의 사원들은 암묵적으로 다음의 규칙에 따라 화장실을 이용하기로 하였다.</p>

<ul>
	<li>선두란, 어떤 줄에서 가장 먼저 와서, 가장 앞에 선 사람을 말한다.</li>
	<li><em>M</em>개의 줄의 선두 중&nbsp;근무 일수&nbsp;<em>D<sub>i</sub></em>가 가장 높은 선두가 화장실을 이용한다.</li>
	<li><em>M</em>개의 줄의 선두 중 근무 일수 <em>D<sub>i</sub></em>가 가장 높은 선두가 둘 이상인 경우, 해당 선두들 중 화장실이 급한 정도&nbsp;<em>H<sub>i</sub></em>가 가장 높은 선두가 화장실을 이용한다.</li>
	<li><em>M</em>개의 줄의 선두 중 근무 일수 <em>D<sub>i</sub></em>가 가장 높은 선두가 둘 이상이며, 해당 선두들의 화장실이 급한 정도&nbsp;<em>H<sub>i</sub></em>도 모두 같다면, 해당 선두 중 줄의 번호가 가장 낮은 줄에 선 선두가 화장실을 이용한다.</li>
</ul>

<p>과연 몇 명의 사원이 화장실을 이용하고 나서야 데카의 차례가 올까? 매우 초조해지기 시작한 데카를 대신해 계산해주자.</p>

### 입력

<p>첫 번째 줄에는 임시 화장실에 대기하고 있는 사원의 수&nbsp;<em>N</em>&nbsp;(1 &le;&nbsp;<em>N</em>&nbsp;&le; 10<sup>5</sup>), 사장이 지시한 새로운 줄의 수&nbsp;<em>M</em>&nbsp;(2 &le;&nbsp;<em>M</em>&nbsp;&le; 10<sup>5</sup>), 데카가 화장실에 도착했을 때 자신의 앞에 서 있던 사원의 수&nbsp;<em>K</em>&nbsp;(0 &le;&nbsp;<em>K</em>&nbsp;&le;&nbsp;<em>N</em>&nbsp;&minus; 1)가 빈칸을 사이에 두고 주어진다.</p>

<p>두 번째 줄부터 각 <em>N</em>개의 줄에 임시 화장실에 <em>i</em>번째로 줄을 섰던 사원의 근무 일수 <em>D<sub>i</sub></em>&nbsp;(0 &le;&nbsp;<em>D<sub>i</sub></em>&nbsp;&le; 36,500), 화장실이 급한 정도를 나타내는 정수 <em>H<sub>i</sub></em> (0 &le;&nbsp;<em>H<sub>i</sub></em>&nbsp;&le; 10<sup>8</sup>)가 가장 먼저 도착한 사원부터 빈칸을 사이에 두고 주어진다.</p>

### 출력

<p>데카가 화장실을 이용하기까지 몇 명의 사원이 화장실을 이용할 것인지 출력한다.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7b7be1a5-a1a9-4330-85a7-91164bf0570d/-/preview/" /></p>

<p>위와&nbsp;같이 줄을 선 경우를 생각해보자.&nbsp;(<em>x</em>, <em>y</em>) 는 사원의 근무 일수가 <em>x</em>, 화장실이 급한 정도가 <em>y</em>임을 나타낸다.&nbsp;[<em>x</em>, <em>y</em>]는 해당 사원이 데카임을 의미한다. 즉, 위의 그림에서 데카는 3번 사원이다.</p>

<p>이 경우 대기 중인 사원의 수&nbsp;<em>N</em>은 6이다. 데카의 앞에는 두 명이 있으므로&nbsp;<em>K</em>는 2다. 이때 사장이 3개의 줄로 나눠 설 것을 지시한다면,</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d1028b32-1684-4fe8-882c-8677b788f4e8/-/preview/" /></p>

<p>와 같이 나눠 설 수 있다. 이때 데카는 줄 번호 3의 선두다.</p>

<p>이제 화장실을 어떤 선두들이 이용하는지 알아보자.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2931a1f5-cbe8-41cd-b112-f956a5fc6a13/-/preview/" /></p>

<p>이 경우 근무 일수가 가장 높은 줄 번호 1의 선두가 화장실을 이용한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/60bac6e5-5722-4190-98f6-e7ab0d6c818e/-/preview/" /></p>

<p>줄 번호 1, 2의 선두가 근무 일수는 1,500으로 같지만, 화장실이 급한 정도는 줄 번호 2의 선두가 더 높기 때문에 줄 번호 2의 선두가 화장실을 이용한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/cf759fc8-a704-4d23-b333-c9563b0e1efa/-/preview/" /></p>

<p>줄 번호 1, 2의 선두가 근무 일수도 1,500으로 같고, 화장실이 급한 정도도 100으로 같지만, 줄 번호는 1이 더 낮기 때문에 줄 번호 1의 선두가 화장실을 이용한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/988f1a9a-8ecf-4fc4-8b10-ebac3ce25582/-/preview/" /></p>

<p>줄 번호 2의 선두가 근무 일수가 제일 높기 때문에 화장실을 이용한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/56c00d17-dca3-4ec8-82f4-6ee76d17ab01/-/preview/" /></p>

<p>줄 번호 3의 선두가 근무 일수가 제일 높으며, 이 사원이 데카이므로 줄에 서 있던 인원 중 데카보다 먼저 화장실을 이용한 사원의 수 4를 출력하면 정답이다.</p>