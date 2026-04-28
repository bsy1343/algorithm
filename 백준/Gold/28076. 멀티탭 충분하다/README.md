# [Gold III] 멀티탭 충분하다 - 28076

[문제 링크](https://www.acmicpc.net/problem/28076)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 411, 정답: 132, 맞힌 사람: 117, 정답 비율: 32.682%

### 분류

정렬, 애드 혹

### 문제 설명

<p>역사와 전통의 인하대학교 PS소모임 CTP는 스터디를 위해 멀티탭 세팅을 수없이 하여, 이제 멀티탭을 가지고 놀 정도의 수준이 되었다. 말 그대로 가지고 놀고 있는데, 2구부터 10<sup>8</sup>구까지 다양한 멀티탭을 보유하고 있다. $k$구 멀티탭은 콘센트가 $k$개 있는 멀티탭을 뜻하며, 다음은 3구 멀티탭의 예시이다. </p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 660px;">
	<tbody>
		<tr>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28076.%E2%80%85%EB%A9%80%ED%8B%B0%ED%83%AD%E2%80%85%EC%B6%A9%EB%B6%84%ED%95%98%EB%8B%A4/0147df8b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/28076.%E2%80%85%EB%A9%80%ED%8B%B0%ED%83%AD%E2%80%85%EC%B6%A9%EB%B6%84%ED%95%98%EB%8B%A4/0147df8b.png" data-original-src="https://upload.acmicpc.net/4d9c58ef-cf5f-4b24-9ee9-644110afeaa5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 93px; width: 320px; margin-top: 12px; margin-bottom: 12px;" /></td>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28076.%E2%80%85%EB%A9%80%ED%8B%B0%ED%83%AD%E2%80%85%EC%B6%A9%EB%B6%84%ED%95%98%EB%8B%A4/25113f95.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/28076.%E2%80%85%EB%A9%80%ED%8B%B0%ED%83%AD%E2%80%85%EC%B6%A9%EB%B6%84%ED%95%98%EB%8B%A4/25113f95.png" data-original-src="https://upload.acmicpc.net/e7d178a2-d4ac-46b4-b30f-52a7a937ce3b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 95px; width: 320px; margin-top: 12px; margin-bottom: 12px;" /></td>
		</tr>
		<tr>
			<td style="text-align: center;">위에서 본 3구 멀티탭</td>
			<td style="text-align: center;">3구 멀티탭의 바닥 면</td>
		</tr>
	</tbody>
</table>

<p>모든 멀티탭은 일자로 곧게 뻗은 모양으로, 콘센트가 동일한 간격으로 배치되어 있다. 특히 양 끝 콘센트의 바닥면에는 플러그가 있어 멀티탭 위에 다른 멀티탭을 꽂을 수 있다. 콘센트는 멀티탭의 긴 방향과 평행한 직선에 대해 30도 기울어져 있고, 위에 꽂는 멀티탭의 긴 방향과 평행한 직선은 그에 대해 수직이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28076.%E2%80%85%EB%A9%80%ED%8B%B0%ED%83%AD%E2%80%85%EC%B6%A9%EB%B6%84%ED%95%98%EB%8B%A4/5beb4a16.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/28076.%E2%80%85%EB%A9%80%ED%8B%B0%ED%83%AD%E2%80%85%EC%B6%A9%EB%B6%84%ED%95%98%EB%8B%A4/5beb4a16.png" data-original-src="https://upload.acmicpc.net/db89d836-afea-43ac-9265-d4f3d7208b92/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 157px; width: 320px; margin-top: 12px; margin-bottom: 12px;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28076.%E2%80%85%EB%A9%80%ED%8B%B0%ED%83%AD%E2%80%85%EC%B6%A9%EB%B6%84%ED%95%98%EB%8B%A4/ae97c085.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/28076.%E2%80%85%EB%A9%80%ED%8B%B0%ED%83%AD%E2%80%85%EC%B6%A9%EB%B6%84%ED%95%98%EB%8B%A4/ae97c085.png" data-original-src="https://upload.acmicpc.net/23adc948-07ea-4bf0-b69c-3e19f41c2094/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 251px; width: 320px;" /></p>

<p>CTP는 $N$개의 멀티탭을 가지고 있고, 각 멀티탭의 콘센트의 수는 $a_1, a_2, ..., a_N$이다. 멀티탭을 $N$층으로 쌓고 위에서 봤을 때 보이는 콘센트의 수의 최솟값을 구하여라. 단, 멀티탭의 콘센트를 제외한 부분과 원근은 무시한다.</p>

### 입력

<p>첫째 줄에 멀티탭의 수 $N$이 주어진다.</p>

<p>둘째 줄에 각 멀티탭의 콘센트의 수를 나타내는 $a_1,a_2,...,a_N$이 공백으로 구분되어 주어진다.</p>

### 출력

<p>문제의 정답에 해당하는 정수를 출력한다.</p>

### 제한

<ul>
	<li>1 &le; $N$ &le; 200,000</li>
	<li>2 &le; 각 멀티탭의 콘센트의 수 &le; 10<sup>8</sup></li>
</ul>