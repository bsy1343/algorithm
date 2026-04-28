# [Silver I] LinkNet - 8539

[문제 링크](https://www.acmicpc.net/problem/8539)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 23, 맞힌 사람: 22, 정답 비율: 88.000%

### 분류

자료 구조, 정렬, 스위핑, 우선순위 큐

### 문제 설명

<p>W sieci LinkNet komputery są przyłączone do linii komunikacyjnej w spos&oacute;b przedstawiony na rysunku. Dostępne punkty przyłączeń są ponumerowane kolejno 0, 1, ..., <em>R</em>. Do jednego punktu może być przyłączony tylko jeden komputer. Każdy z komputer&oacute;w może być przyłączony do sieci tylko w jednym punkcie. Komunikacja w sieci jest synchroniczna.</p>

<center style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/8539.%E2%80%85LinkNet/901de43d.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/8539.%E2%80%85LinkNet/901de43d.png" data-original-src="https://upload.acmicpc.net/01e6c4a7-eda1-44e3-a40d-a58b9ca66236/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></center>

<p>W danym takcie komputery przyłączone do punkt&oacute;w 0 &le; <em>a</em> &lt; <em>b</em> &le; <em>R</em>&nbsp;mogą dokonać transmisji danych tylko wtedy, gdy żaden komputer przyłączony do łącza o numerze <em>c</em>, <em>a</em> &lt; <em>c</em> &lt; <em>b</em>&nbsp;nie bierze udziału w transmisji danych z jakimkolwiek innym komputerem. W jednym takcie komputer może brać udział tylko w jednej tranmisji.</p>

<p>Napisz program kt&oacute;ry:</p>

<ul>
	<li>wczytuje opisy transmisji, kt&oacute;re trzeba zrealizować,</li>
	<li>oblicza jaka jest minimalna liczba takt&oacute;w wystarczających do zrealizowania transmisji,</li>
	<li>wypisuje obliczoną liczbę.</li>
</ul>

### 입력

<p>W pierwszym wierszu danych podana jest liczba transmisji <em>N</em>: 0 &le; <em>N</em> &le; 100000. W kolejnych&nbsp;<em>N</em>&nbsp;wierszach podane są opisy transmisji - po jednym w wierszu. Opis każdej transmisji składa się z dw&oacute;ch liczb <em>a</em>, <em>b</em>: 0 &le; <em>a</em> &lt; <em>b</em> &le; 1 000 000 000,&nbsp;oznaczających numery punkt&oacute;w, pomiędzy kt&oacute;rymi ma być transmisja danych. Liczby <em>a</em>&nbsp;i <em>b</em>&nbsp;są oddzielone spacją.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyniku powinna być podana jedna liczba: minimalna liczba takt&oacute;w wystarczających do zrealizowania wszystkich transmisji opisanych w danych.</p>