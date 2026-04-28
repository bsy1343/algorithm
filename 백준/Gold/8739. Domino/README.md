# [Gold III] Domino - 8739

[문제 링크](https://www.acmicpc.net/problem/8739)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 58, 정답: 21, 맞힌 사람: 15, 정답 비율: 34.884%

### 분류

자료 구조, 그리디 알고리즘

### 문제 설명

<p>Jaś układa domino. Nie robi tego jednak w tradycyjny spos&oacute;b, tylko bawi się w przewracanie kolejnych klock&oacute;w domina. Wiemy, że klocki Jasia są r&oacute;żnych wysokości. Jaś postawił <em>n</em>&nbsp;klock&oacute;w domina w ciągu w taki spos&oacute;b, aby przewr&oacute;cenie się dowolnego klocka spowodowało przewr&oacute;cenie się kolejnego klocka w ciągu. Wiadomo, że kolejny klocek przewr&oacute;ci się, jeśli wysokość przewracanego klocka jest większa od odległości pomiędzy nimi. Jaś chciałby wiedzieć, ile niepotrzebnych klock&oacute;w może usunąć z ciągu, aby przewr&oacute;cenie pierwszego klocka w ciągu spowodowało (poprzez przewracanie się pośrednich klock&oacute;w) przewr&oacute;cenie się ostatniego klocka w ciągu. Jaś nie może zmieniać położenia klock&oacute;w.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą liczbę klock&oacute;w Jasia. Drugi wiersz wejścia zawiera ciąg&nbsp;<em>n</em>&nbsp;liczb całkowitych <em>w</em><sub>1</sub>, <em>w</em><sub>2</sub>, ..., <em>w<sub>n</sub></em>&nbsp;(1 &le; <em>w<sub>i</sub></em> &le; 10<sup>9</sup>), gdzie&nbsp;<em>w<sub>i</sub></em>&nbsp;oznacza wysokość <em>i</em>&nbsp;- tego klocka w ciągu. Trzeci wiersz wejścia zawiera odległości pomiędzy klockami w ciągu. Składa się z ciągu <em>n</em> - 1&nbsp;liczb całkowitych <em>x</em><sub>1</sub>, <em>x</em><sub>2</sub>, ..., <em>x</em><sub><em>n</em>-1</sub>&nbsp;(1 &le; <em>x<sub>i</sub></em> &le; 10<sup>9</sup>), gdzie&nbsp;<em>x<sub>i</sub></em>&nbsp;oznacza odległość pomiędzy <em>i</em>&nbsp;- tym a <em>i</em> + 1&nbsp;- wszym klockiem w ciągu.</p>

### 출력

<p>Pierwszy i jedyny wiesz standardowego wyjścia powinien zawierać jedną liczbę całkowitą r&oacute;wną maksymalnej liczbie klock&oacute;w, kt&oacute;re możemy usunąć z ciągu.</p>