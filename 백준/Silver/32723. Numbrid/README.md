# [Silver V] Numbrid - 32723

[문제 링크](https://www.acmicpc.net/problem/32723)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 117, 정답: 54, 맞힌 사람: 41, 정답 비율: 52.564%

### 분류

구현, 정렬

### 문제 설명

<p>Värskelt asutatud jalgpalliklubi mängijad valivad oma särkidele numbreid. Iga mängija ütleb, millist numbrit ta soovib.</p>

<p>Kirjutada programm, mis leiab kõik sellised numbrid, mida mitte keegi ei soovinud, kuid mille korral leidub mängija, kes soovis väiksemat numbrit, ja mängija, kes soovis suuremat numbrit.</p>

### 입력

<p>Sisendi esimesel real on numbri valinud mängijate arv $N$ ($1 \le N \le 50\,000$). Teisel real on $N$ tühikutega eraldatud täisarvu: mängijate soovitud numbrid. Kõik need numbrid on lõigust $0 \ldots 10\,000\,000$.</p>

### 출력

<p>Väljundi esimesele reale kirjutada mittesoovitud numbrite koguarv $M$. Teisele reale väljastada need numbrid tühikutega eraldatult ja kasvavas järjestuses. Võib eeldada, et korrektse vastuse korral $M \le 50\,000$.</p>