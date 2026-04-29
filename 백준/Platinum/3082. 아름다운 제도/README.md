# [Platinum V] 아름다운 제도 - 3082

[문제 링크](https://www.acmicpc.net/problem/3082)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 81, 정답: 13, 맞힌 사람: 8, 정답 비율: 21.053%

### 분류

(분류 없음)

### 문제 설명

<p>상근이가 살고 있는 나라는 매우 많은 섬으로 이루어져 있다. 이 나라의 국민들은 나라가 매우 많은 섬으로 이루어져 있다는 사실을 자랑스러워 하고 있다.&nbsp;</p>

<p>나라를 이루고 있는 섬 중 일부는 같은 모양이다. 한 섬을 이동시켜서 다른 섬과 완전히 일치하게 만들 수 있다면, 두 섬을 같은 모양이라고 한다. 이러한 사실 때문에, 많은 관광객은 나라의 아름다움을 측정한다. 나라의 아름다움이란 같은 모양을 가지는 섬의 쌍의 개수와 같다.</p>

<p>하지만, 지구 온난화 때문에 해수면은 매년 상승하고 있다. 해수면의 상승은 아름다움을 매년 변하게 만든다.</p>

<p>이 나라의 지도는 R×C개의 정사각형으로 나타낼 수 있다. 지도를 만든 시점에 해수면은 0이며, 섬의 높이는 모두 자연수이다. 해수면은 1년에 1씩 상승한다. T년이 지난 후에, T보다 낮은 높이를 가진 섬은 모두 물에 잠기게 된다. 섬을 이루고 있는 돌은 모두 구멍이 많다. 따라서, T보다 높이가 낮으면서 섬의 내부에 있는 곳도 모두 물에 잠기게 된다. 두 땅(정사각형)이 같은 섬에 포함되려면, 한 땅에서 출발해서 그 땅으로 왼쪽, 오른쪽, 위, 아래쪽 땅으로만 지나가서 도착할 수 있어야 한다.</p>

<table class="table table-bordered td-center td-middle">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3082.%E2%80%85%EC%95%84%EB%A6%84%EB%8B%A4%EC%9A%B4%E2%80%85%EC%A0%9C%EB%8F%84/d153b59e.jpg" data-original-src="https://boja.mercury.kr/assets/problem/3082-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 168px; height: 191px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3082.%E2%80%85%EC%95%84%EB%A6%84%EB%8B%A4%EC%9A%B4%E2%80%85%EC%A0%9C%EB%8F%84/524d17c3.jpg" data-original-src="https://boja.mercury.kr/assets/problem/3082-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 165px; height: 193px;"></td>
		</tr>
		<tr>
			<td>초기 상태</td>
			<td>5년 후</td>
		</tr>
	</tbody>
</table>

<p>T년이 지난 후에 이 나라의 아름다움이 어떻게 변하는지 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 지도의 크기 R과 C가 주어진다. (3 ≤ R, C ≤ 1000)</p>

<p>다음 R개 줄에는 C개의 음이 아닌 정수가&nbsp;주어진다. 정수는 공백으로 구분되어져 있다. 각 값은 10<sup>9</sup>를 넘지 않고, 측정할 당시에 그 땅의 높이를 나타낸다.</p>

<p>다음 줄에는 조사하려고 하는 연도의 수 Q가 주어진다.&nbsp;(1 ≤ Q ≤ 100 000)</p>

<p>다음 줄에는 Q개의 자연수가 공백으로 구분되어 주어지며, 모두 10<sup>9</sup>를 넘지 않는다. 입력으로 주어진 값에 따라서 그 해가 지나면 아름다움이 어떻게 변하는지를 출력한다. 연도는 오름차순으로 주어진다.</p>

### 출력

<p>총 Q개 줄에 걸쳐서, 입력으로 주어진 해만큼 지나면 나라의 아름다움이 몇 인지를 출력한다.</p>