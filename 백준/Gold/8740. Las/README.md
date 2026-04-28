# [Gold III] Las - 8740

[문제 링크](https://www.acmicpc.net/problem/8740)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 11, 맞힌 사람: 10, 정답 비율: 45.455%

### 분류

그래프 이론, 그래프 탐색, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Pan Jan posiada spory teren lasu obejmujący kwadratowy teren o boku <em>n</em>. Rozmieszczonych jest tam <em>n</em><sup>2</sup>&nbsp;drzew, po&nbsp;<em>n</em>&nbsp;drzew w każdym wierszu i po&nbsp;<em>n</em>&nbsp;drzew w każdej kolumnie. Każde drzewo ma określony wiek. Pan Jan chce zbudować dom o powierzchni <em>d</em>, jednak w tym celu musi wyciąć pewien fragment swojego lasu (a dokładniej&nbsp;<em>d</em>&nbsp;drzew, ponieważ każde drzewo zajmuje 1 jednostkę powierzchni). Fragment ten musi być oczywiście sp&oacute;jny. Pan Jan zastanawia się teraz, kt&oacute;ry fragment wybrać. Chciałby, aby najstarsze drzewo ze wszystkich wyciętych było możliwie najmłodsze.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dwie liczby całkowite&nbsp;<em>n</em>&nbsp;i <em>d</em>&nbsp;(1 &le; <em>d</em> &le; <em>n</em> &le; 1 000), oznaczające odpowiednio wielkość terenu oraz powierzchnię domu kt&oacute;ry chce zbudować pan Jan. <em>n</em>&nbsp;kolejnych wierszy zawiera po&nbsp;<em>n</em>&nbsp;liczb całkowitych <em>w</em>(<em>i</em>, <em>k</em>)&nbsp;(1 &le; <em>w</em>(<em>i</em>, <em>k</em>) &le; 10<sup>9</sup>), oznaczających wiek drzewa stojącego w <em>i</em>&nbsp;- tym wierszu i <em>k</em>&nbsp;- tej kolumnie.</p>

### 출력

<p>Pierwszy wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą r&oacute;wną minimalnemu wiekowi najstarszego drzewa ze wszystkich wyciętych.</p>