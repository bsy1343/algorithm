# [Silver V] Obwody - 8735

[문제 링크](https://www.acmicpc.net/problem/8735)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 114, 정답: 56, 맞힌 사람: 39, 정답 비율: 42.391%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Jaś na urodziny dostał komplet magicznych elektrycznych kabelk&oacute;w. Każdy kabelek składa się z drutu oraz bateryjki. <em>i</em>-ty drut może wytrzymać napięcie <em>d<sub>i</sub></em>&nbsp;wolt&oacute;w, a&nbsp;<em>i</em>-ta bateryjka ma napięcie&nbsp;<em>b<sub>i</sub></em>&nbsp;wolt&oacute;w.</p>

<p>Jasio buduje z kabelk&oacute;w obwody: wybiera druty, skręca je razem tworząc grubszy drut i robi z niego k&oacute;łko. W k&oacute;łku napięcie jest sumą napięć wszystkich bateryjek, a skręcony drut może wytrzymać napięcie będące sumą napięć, kt&oacute;re mogą wytrzymać poszczeg&oacute;lne druty.</p>

<p>Jaś buduje obw&oacute;d tak, aby zrobione k&oacute;łko nie przepaliło się. Z ilu maksymalnie kabelk&oacute;w może się ono składać?</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 500 000), oznaczająca liczę drut&oacute;w. W&nbsp;<em>n</em>&nbsp;następnych linijkach pary liczb <em>d<sub>i</sub></em>,&nbsp;<em>b<sub>i</sub></em>&nbsp;opisujące kolejne druty (0 &le; <em>d<sub>i</sub></em>, <em>b<sub>i</sub></em> &le; 10<sup>6</sup>).</p>

### 출력

<p>W jedynej linijce powinna znaleźć się liczba całkowita oznaczająca maksymalna liczbę drut&oacute;w tworzących k&oacute;łko.</p>