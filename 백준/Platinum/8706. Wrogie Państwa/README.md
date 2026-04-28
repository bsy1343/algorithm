# [Platinum II] Wrogie Państwa - 8706

[문제 링크](https://www.acmicpc.net/problem/8706)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 7, 맞힌 사람: 7, 정답 비율: 35.000%

### 분류

그래프 이론, 최대 유량, 최대 유량 최소 컷 정리

### 문제 설명

<p>Bitocja i Bajtocja planują podpisać rozejm po długotrwałej wojnie. Państwa te muszą zdecydować, do kogo będą należeć poszczeg&oacute;lne miasta. Władcy Bitocji i Bajtocji postanowili, że dokonają podziału tak, aby zminimalizować liczbę bezpośrednich połączeń między parami miast, należącymi do r&oacute;żnych państw.</p>

<p>Twoim zadaniem jest podanie wspomnianej wyżej liczby po podpisaniu rozejmu.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera dwie liczby całkowite <em>n</em>&nbsp;i <em>m</em>&nbsp;(1 &le; <em>n</em> &le; 500, 0 &le; <em>m</em> &le; <em>n</em>(<em>n</em> - 1)/2), oznaczające odpowiednio liczbę miast oraz liczbę połączeń. Drugi wiersz wejścia zawiera ciąg liczb całkowitych <em>a</em><sub>1</sub>, <em>a</em><sub>2</sub>, ..., <em>a<sub>n</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &le; 3). Jeżeli&nbsp;<em>a<sub>i</sub></em>&nbsp;ma wartość 1, to miasto <em>i</em>&nbsp;należeć będzie do Bitocji, 2, to miasto&nbsp;<em>i</em>&nbsp;należeć będzie do Bajtocji, 3, to miasto&nbsp;<em>i</em>&nbsp;należy przydzielić albo do Bajtocji albo do Bitocji. Kolejnych <em>m</em>&nbsp;wierszy zawiera opisy połączeń między miastami. Każdy wiersz opisu zawierać będzie dwie liczby <em>a</em>, <em>b</em>, (1 &le; <em>a</em> &lt; <em>b</em> &le; <em>n</em>) oznaczające, że miasta <em>a</em>&nbsp;i <em>b</em>&nbsp;są połączone bezpośrednią drogą. Żadna para (<em>a</em>, <em>b</em>) się nie powt&oacute;rzy.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną liczbie połączeń między miastami należącymi do Bitocji i Bajtocji po podpisaniu rozejmu.</p>

### 힌트

<p>Jeżeli miasto numer 3 zostanie przydzielone Bitocji, to występować będzie tylko jedno połączenie między miastami Bitocji i Bajtocji - między miastami 3 i 4.</p>