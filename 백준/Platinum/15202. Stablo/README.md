# [Platinum IV] Stablo - 15202

[문제 링크](https://www.acmicpc.net/problem/15202)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 15, 맞힌 사람: 10, 정답 비율: 62.500%

### 분류

깊이 우선 탐색, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>Stablo je struktura koja se sastoji od n vrhova označenih brojevima od 1 do n i n &minus; 1 bridova postavljenih tako da izmedu svaka dva vrha stabla postoji jedinstven put. Dodatno, u svaki vrh je upisan točno jedan znak i to veliko slovo Aili veliko slovo B.</p>

<p>Stablo je uravnoteženo ako ne postoji brid koji povezuje vrhove označene istim slovom. Stablo možemo poku&scaron;ati uravnotežiti nizom koraka gdje u svakom koraku odaberemo jedan brid i zamijenimo znakove zapisane u vrhovima koje brid povezuje.</p>

<p>Odredite minimalan broj koraka potrebnih da se uravnoteži zadano stablo.</p>

### 입력

<p>U prvom redu nalazi se prirodni broj n (1 &le; n &le; 300 000) &mdash; broj vrhova stabla. Sljedeći red sadrži niz od n znakova gdje je svaki znak veliko slovo Aili B&mdash; j-ti znak u nizu je znak inicijalno zapisan u vrhu j.</p>

<p>Svaki od sljedećih n &minus; 1 redova sadrži dva različita prirodna broja x i y (1 &le; x, y &le; n) &mdash; oznake vrhova direktno povezanih bridom. Vrhovi i bridovi čine stablo kao &scaron;to je opisano u tekstu zadatka.</p>

### 출력

<p>Ispi&scaron;ite traženi minimalni broj koraka. Ako nije moguće uravnotežiti stablo, ispi&scaron;ite -1.</p>