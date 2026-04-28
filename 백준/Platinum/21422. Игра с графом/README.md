# [Platinum I] Игра с графом - 21422

[문제 링크](https://www.acmicpc.net/problem/21422)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 12, 맞힌 사람: 8, 정답 비율: 57.143%

### 분류

임의 정밀도 / 큰 수 연산, 포함 배제의 원리, 수학

### 문제 설명

<p>Петя и Вася играют в очередную интересную игру. У них есть лист бумаги, на котором изображены $n$ кружочков, помеченных числами от $1$ до $n$. Участники по очереди рисуют стрелочки, соединяющие кружочки. При этом стрелочку из кружочка $a$ в кружочек $b$ разрешено проводить, если выполнены два условия:</p>

<ol>
	<li>еще нет стрелочки из $a$ в $b$;</li>
	<li>нельзя дойти по стрелочкам из $b$ в $a$.</li>
</ol>

<p>Например, в позиции на рис. 1 можно поставить одну из трех стрелочек (рис. 2).</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21422.%E2%80%85%D0%98%D0%B3%D1%80%D0%B0%E2%80%85%D1%81%E2%80%85%D0%B3%D1%80%D0%B0%D1%84%D0%BE%D0%BC/1c684010.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/21422.%E2%80%85%D0%98%D0%B3%D1%80%D0%B0%E2%80%85%D1%81%E2%80%85%D0%B3%D1%80%D0%B0%D1%84%D0%BE%D0%BC/1c684010.png" data-original-src="https://upload.acmicpc.net/bd39e9a1-4582-426a-8983-27db29fddbb3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 107px; height: 108px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21422.%E2%80%85%D0%98%D0%B3%D1%80%D0%B0%E2%80%85%D1%81%E2%80%85%D0%B3%D1%80%D0%B0%D1%84%D0%BE%D0%BC/a857e5ef.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/21422.%E2%80%85%D0%98%D0%B3%D1%80%D0%B0%E2%80%85%D1%81%E2%80%85%D0%B3%D1%80%D0%B0%D1%84%D0%BE%D0%BC/a857e5ef.png" data-original-src="https://upload.acmicpc.net/d3e90f1a-225a-4664-9d20-b871b1261a7e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 105px; height: 108px;" /></td>
		</tr>
		<tr>
			<td>Рис. 1</td>
			<td>Рис. 2</td>
		</tr>
	</tbody>
</table>

<p>Проигрывает тот, кто не может сделать ход.</p>

<p>Петя решил написать программу, играющую в эту игру. Для этого он хочет сначала посчитать, сколько различных позиций может получиться на доске.&nbsp;</p>

### 입력

<p>Входной файл содержит одно число $n$ ($1\le n\le 100$).</p>

### 출력

<p>Выведите в выходной файл число возможных позиций без ведущих нулей.</p>

### 힌트

<p>Приведем все 25 возможных позиций для примера из условия:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21422.%E2%80%85%D0%98%D0%B3%D1%80%D0%B0%E2%80%85%D1%81%E2%80%85%D0%B3%D1%80%D0%B0%D1%84%D0%BE%D0%BC/332b3862.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/21422.%E2%80%85%D0%98%D0%B3%D1%80%D0%B0%E2%80%85%D1%81%E2%80%85%D0%B3%D1%80%D0%B0%D1%84%D0%BE%D0%BC/332b3862.png" data-original-src="https://upload.acmicpc.net/d12a6dbf-6942-4fdc-ae96-48ee3028bb09/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 662px; height: 203px;" /></p>