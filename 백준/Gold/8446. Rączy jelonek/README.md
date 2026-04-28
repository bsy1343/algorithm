# [Gold I] Rączy jelonek - 8446

[문제 링크](https://www.acmicpc.net/problem/8446)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 6, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

수학, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 임의 정밀도 / 큰 수 연산, 런타임 전의 전처리

### 문제 설명

<p>Rączy jelonek zmierza długimi susami na polanę. Rozpiera go energia, więc każdy jego skok może być nawet dwa razy dłuższy od poprzedniego.</p>

<p>Formalnie rzecz ujmując, w każdym momencie energia jelonka jest na określonym poziomie <em>i</em>. Jelonek ma dwie możliwości ruchu:</p>

<ul>
	<li>skok o&nbsp;<em>i</em>&nbsp;metr&oacute;w w prz&oacute;d lub w tył, powodujący automatyczne przełączenie na poziom energii 2<em>i</em>,</li>
	<li>skok wzwyż, kt&oacute;ry nie powoduje przemieszczenia na drodze do polany oraz skutkuje przełączeniem na poziom <em>i</em>/2.</li>
</ul>

<p>Początkowo, jelonek ma energię r&oacute;wną 1. W momencie, gdy jego energia jest r&oacute;wna 1&nbsp;i jelonek skoczy wzwyż, zatrzymuje się.</p>

<p>Poniżej przedstawiono przykładową podr&oacute;ż rączego jelonka, kt&oacute;ra rozpoczęła się w punkcie po lewej stronie drogi. Numery nad strzałkami oznaczają poziom energii jelonka&nbsp;<i>po</i>&nbsp;danym skoku. Wartość 0&nbsp;oznacza, że jelonek się zatrzymał.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8446.%E2%80%85R%C4%85czy%E2%80%85jelonek/fe3c385f.png" data-original-src="https://upload.acmicpc.net/ffcd3ced-4a3d-4a55-a1ae-45f96f3085ed/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Droga prowadząca do polany jest nieskończona w obydw&oacute;ch kierunkach. Oznacza to, że jelonek w trakcie podr&oacute;ży może znaleźć się za polaną lub przed punktem, z kt&oacute;rego wyrusza. Jelonka od celu dzieli początkowo <i>n</i>&nbsp;metr&oacute;w. Oblicz, jaka jest najmniejsza liczba skok&oacute;w, kt&oacute;ra pozwoli mu dotrzeć do polany i zatrzymać się tam.</p>

### 입력

<p>Pierwsza linia wejścia, zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; n &le; 10<sup>100</sup>) oznaczająca odległość pomiędzy jelonkiem a polaną. Dodatkowo, w testach wartych sumarycznie 40%&nbsp;punkt&oacute;w, <em>n</em> &le; 100 000.</p>

### 출력

<p>Wypisz jedną liczbę całkowitą r&oacute;wną minimalnej liczbie skok&oacute;w, kt&oacute;re musi wykonać jelonek, aby dotrzeć do polany i zatrzymać się.</p>