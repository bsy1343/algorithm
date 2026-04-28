# [Platinum III] Rywalizacja - 8779

[문제 링크](https://www.acmicpc.net/problem/8779)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 11, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

자료 구조, 덱, 슬라이딩 윈도우, 덱을 이용한 구간 최댓값 트릭

### 문제 설명

<p>Hektor mieszka w jednorodzinnym domku na osiedlu podobnych domk&oacute;w rozmieszczonych na planie regularnej siatki&nbsp;<strong>W</strong>*<strong>K</strong>&nbsp;dom&oacute;w podzielonych na&nbsp;<strong>W</strong>&nbsp;wierszy i&nbsp;<strong>K</strong>&nbsp;kolumn. Każdy domek zajmuje jedno pole o wymiarach 1 na 1 a jego położenie opisuje para liczb - numer wiersza i numer kolumny w kt&oacute;rych znajduje się domek.</p>

<p>Rok temu na osiedlu Hektora odbył się konkurs na najładniej przycięty trawnik, podczas kt&oacute;rego jurorzy przyznali każdemu domkowi ocenę. W tym roku ma odbyć się kolejna edycja. Mieszkańcy osiedla uwielbiają rywalizację i nie znoszą, kiedy są w czymś gorsi od swoich sąsiad&oacute;w. Hektor spodziewa się, że każdy domek będzie walczył o przynajmniej tak dobrą ocenę, jak najlepsza uzyskana w jego otoczeniu w zeszłorocznym konkursie. Otoczeniem domku o wsp&oacute;łrzędnych (<strong>w</strong>,<strong>k</strong>) są wszystkie domki o wsp&oacute;łrzędnych (<strong>a</strong>,<strong>b</strong>) takie, że&nbsp;<strong>a</strong>&nbsp;r&oacute;żni się od&nbsp;<strong>w</strong>&nbsp;o maksymalnie&nbsp;<strong>R</strong>, i&nbsp;<strong>b</strong>&nbsp;r&oacute;żni się od&nbsp;<strong>k</strong>&nbsp;o maksymalnie&nbsp;<strong>R</strong>&nbsp;(otoczenie domku o wsp&oacute;łrzędnych (<strong>w</strong>,<strong>k</strong>) ma więc postać kwadratu o długości boku 2*<strong>R</strong>&nbsp;+ 1 i środku w (<strong>w</strong>,<strong>k</strong>)).</p>

<p>Znając oceny przyznane poszczeg&oacute;lnym domkom oblicz dla każdego domku najlepszą ocenę uzyskaną w jego otoczeniu.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>Pierwsza linia opisu zestawu testowego zawiera dwie oddzielone spacjami liczby naturalne&nbsp;<strong>W</strong>,&nbsp;<strong>K&nbsp;</strong>i<strong>&nbsp;R</strong>&nbsp;( 1 &lt;=<strong>W</strong>,<strong>&nbsp;K</strong>,<strong>&nbsp;R</strong>&nbsp;&lt;= 1000), oznaczające wymiary osiedla Hektora oraz rozmiar sąsiedztwa.</p>

<p>W kolejnych&nbsp;<strong>W</strong>&nbsp;liniach opisywane są oceny&nbsp;przyznane domkom w kolejnych wierszach osiedla (od pierwszego wiersza do&nbsp;<strong>W</strong>-tego wiersza). Opis pojedynczego wiersza zawiera&nbsp;<strong>K</strong>&nbsp;oddzielonych spacjami liczb naturalnych&nbsp;<strong>g</strong><strong><sub>i&nbsp;</sub></strong>( 1 &lt;=&nbsp;<strong>g<sub>i</sub></strong><sub>&nbsp;</sub>&lt;= 1000000 ) oznaczających oceny przyznane kolejnym domkom w danym wierszu (począwszy od domku w pierwszej kolumnie do domku w&nbsp;<strong>K</strong>-tej kolumnie).</p>

### 출력

<p>Dla każdego testu należy wypisać w&nbsp;<strong>W</strong>&nbsp;wierszach (po&nbsp;<strong>K</strong>&nbsp;oddzielonych spacjami liczb naturalnych każdy) najlepsze oceny uzyskane w otoczeniu każdego domku, w porządku odpowiadającym porządkowi wejścia.</p>