# [Silver II] Bomboni - 14146

[문제 링크](https://www.acmicpc.net/problem/14146)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 49, 정답: 32, 맞힌 사람: 25, 정답 비율: 64.103%

### 분류

수학, 정수론

### 문제 설명

<p>Ivica je pozvao sve svoje prijatelje na veliku zabavu. Svi znaju da nijedno pravo druženje ne može proći bez megapopularnih i nezamjenjivih PEZ bombona.</p>

<p>Ivica se boji da će tih slatki&scaron;a biti premalo, pa ne želi kupiti manje od A bombona. Isto tako, ima dovoljno novaca za najvi&scaron;e B bombona. Budući da se neće svi prijatelji odazvati, Ivica ne zna točan broj sudionika zabave. Stoga želi kupiti količinu bombona koju može ravnopravno podijeliti na najvi&scaron;e moguće načina. Podjela bombona je ravnopravna ako svaki od prijatelja dobije jednako mnogo bombona i ako pri tome svi kupljeni bomboni budu podijeljeni. Na primjer, ukoliko Ivica kupi 6 bombona, moći će ih ravnopravno podijeliti na 4 načina: { 1+1+1+1+1+1, 2+2+2, 3+3, 6 }.</p>

<p>Napi&scaron;ite program koji će pomoći Ivici odlučiti koliko bombona treba kupiti.&nbsp;</p>

### 입력

<p>U prvom i jedinom retku ulaza nalaze se dva prirodna broja A i B, 1 &le; A &le; B &le; 2 000 000, odvojena jednim razmakom.&nbsp;</p>

### 출력

<p>Označimo sa M maksimalni broj načina na koje Ivica može ravnopravno podijeliti kupljene bombone. Neka je S skup svih brojeva X u intervalu [A, B] takvih da ako Ivica kupi X bombona, onda ih može ravnopravno podijeliti na M načina; neka je N broj elemenata skupa S.</p>

<p>U prvi redak izlaza ispi&scaron;ite brojeve M i N odvojene razmakom. U svaki od idućih N redaka ispi&scaron;ite po jedan element skupa X; elementi trebaju biti ispisani uzlazno po veličini.&nbsp;</p>