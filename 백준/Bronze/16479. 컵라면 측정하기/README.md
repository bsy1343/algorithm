# [Bronze III] 컵라면 측정하기 - 16479

[문제 링크](https://www.acmicpc.net/problem/16479)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 2860, 정답: 2289, 맞힌 사람: 1966, 정답 비율: 80.541%

### 분류

수학, 기하학, 피타고라스 정리

### 문제 설명

<p>컵라면은 두 개의 밑면이 서로 평행하며, 원 모양인 원뿔대이다. 따라서 컵라면을 옆에서 본 모습은 아래&nbsp;그림과 같은 등변사다리꼴이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/16479.%E2%80%85%EC%BB%B5%EB%9D%BC%EB%A9%B4%E2%80%85%EC%B8%A1%EC%A0%95%ED%95%98%EA%B8%B0/10133ec4.png" data-original-src="https://upload.acmicpc.net/d64aada2-3953-4dd1-90aa-27eca6cfbb35/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 140px; height: 144px;" /></p>

<p>위&nbsp;등변사다리꼴에서 민수가 측정한 컵라면의 윗면의 지름은&nbsp;<i>D</i><sub>1</sub>, 아랫면의 지름은&nbsp;<i>D</i><sub>2</sub>이다. 민수가 아직 측정하지 않은 변의 길이는 <em>K</em>이다. 이때, (컵라면의 높이)<sup>2</sup>의 값을 알아내는 프로그램을 작성하시오. (단, 컵라면의 높이는 등변사다리꼴에서 평행한 두 변 사이의 거리로 정의한다.)</p>

### 입력

<p>첫째 줄에 <em>K</em>의 값이 주어진다. 둘째 줄에는 <em>D</em><sub>1</sub>과 <em>D</em><sub>2</sub>의 값이 사이에 공백을 한 개 두고 차례대로 주어진다. 단, <em>K</em>, <em>D</em><sub>1</sub>, <em>D</em><sub>2</sub>의 값은 양의 정수이다.</p>

### 출력

<p>첫째 줄에 (컵라면의 높이)<sup>2</sup>의&nbsp;값을 출력한다. 절대/상대 오차는 10<sup>-6</sup> 까지 허용한다.</p>

### 제한

<ul>
	<li>0 &lt; <em>K</em>, <em>D</em><sub>1</sub>, <em>D</em><sub>2</sub>&nbsp;&le; 100</li>
	<li>0&nbsp;&le; <em>D</em><sub>1</sub>-<em>D</em><sub>2</sub>&nbsp;&lt; 2&times;<em>K</em></li>
</ul>