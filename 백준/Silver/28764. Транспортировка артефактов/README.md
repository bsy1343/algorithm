# [Silver II] Транспортировка артефактов - 28764

[문제 링크](https://www.acmicpc.net/problem/28764)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 11, 맞힌 사람: 10, 정답 비율: 83.333%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Для перевозки трёх ценных артефактов, найденных при раскопках на Дальнем Востоке, планируется изготовить специальную баржу. Каждый из артефактов имеет форму прямоугольника, размеры $i$-го артефакта $a_i \times b_i$.</p>

<p>Баржа должна иметь форму прямоугольника. При размещении артефактов на барже они должны располагаться таким образом, чтобы их стороны были параллельны сторонам баржи. Прямоугольники артефактов не должны иметь общих внутренних точек (но могут касаться друг друга углами или сторонами).</p>

<p>Для экономии средств площадь баржи должна быть минимальной возможной.</p>

<p>Требуется написать программу, которая по заданным размерам обнаруженных артефактов определяет минимальную площадь баржи, которую необходимо изготовить для перевозки артефактов.</p>

### 입력

<p>Ввод состоит из шести строк, которые содержат целые числа $a_1$, $b_1$, $a_2$, $b_2$, $a_3$ и $b_3$, соответственно ($1 \le a_i, b_i \le 10^4$).</p>

### 출력

<p>Выведите одно число: минимальную возможную площадь баржи, которую необходимо изготовить для перевозки артефактов.</p>

### 힌트

<p>Артефакты в первом примере, оптимальная баржа и один из вариантов оптимального размещения показаны на следующем рисунке.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/28764.%E2%80%85%D0%A2%D1%80%D0%B0%D0%BD%D1%81%D0%BF%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0%E2%80%85%D0%B0%D1%80%D1%82%D0%B5%D1%84%D0%B0%D0%BA%D1%82%D0%BE%D0%B2/c842bd06.png" data-original-src="https://upload.acmicpc.net/316d1472-f8c8-4515-aa73-2c09c38e33a3/-/crop/287x212/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 144px; height: 106px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/28764.%E2%80%85%D0%A2%D1%80%D0%B0%D0%BD%D1%81%D0%BF%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0%E2%80%85%D0%B0%D1%80%D1%82%D0%B5%D1%84%D0%B0%D0%BA%D1%82%D0%BE%D0%B2/be3ee331.png" data-original-src="https://upload.acmicpc.net/316d1472-f8c8-4515-aa73-2c09c38e33a3/-/crop/210x212/423,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 105px; height: 106px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/28764.%E2%80%85%D0%A2%D1%80%D0%B0%D0%BD%D1%81%D0%BF%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0%E2%80%85%D0%B0%D1%80%D1%82%D0%B5%D1%84%D0%B0%D0%BA%D1%82%D0%BE%D0%B2/8133e9d1.png" data-original-src="https://upload.acmicpc.net/316d1472-f8c8-4515-aa73-2c09c38e33a3/-/crop/210x212/814,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 105px; height: 106px;" /></td>
		</tr>
		<tr>
			<td>Артефакты</td>
			<td>Баржа</td>
			<td>Размещение на барже</td>
		</tr>
	</tbody>
</table>

<p>Артефакты во втором примере, оптимальная баржа и один из вариантов оптимального размещения показаны на следующем рисунке.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/28764.%E2%80%85%D0%A2%D1%80%D0%B0%D0%BD%D1%81%D0%BF%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0%E2%80%85%D0%B0%D1%80%D1%82%D0%B5%D1%84%D0%B0%D0%BA%D1%82%D0%BE%D0%B2/b5792a7c.png" data-original-src="https://upload.acmicpc.net/5df622cc-799f-49a1-8b18-26c378ece5e9/-/crop/364x258/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 182px; height: 129px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/28764.%E2%80%85%D0%A2%D1%80%D0%B0%D0%BD%D1%81%D0%BF%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0%E2%80%85%D0%B0%D1%80%D1%82%D0%B5%D1%84%D0%B0%D0%BA%D1%82%D0%BE%D0%B2/6a9d1baa.png" data-original-src="https://upload.acmicpc.net/5df622cc-799f-49a1-8b18-26c378ece5e9/-/crop/178x258/499,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 91px; height: 132px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/28764.%E2%80%85%D0%A2%D1%80%D0%B0%D0%BD%D1%81%D0%BF%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0%E2%80%85%D0%B0%D1%80%D1%82%D0%B5%D1%84%D0%B0%D0%BA%D1%82%D0%BE%D0%B2/5c851db7.png" data-original-src="https://upload.acmicpc.net/5df622cc-799f-49a1-8b18-26c378ece5e9/-/crop/178x258/878,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 91px; height: 132px;" /></td>
		</tr>
		<tr>
			<td>Артефакты</td>
			<td>Баржа</td>
			<td>Размещение на барже</td>
		</tr>
	</tbody>
</table>