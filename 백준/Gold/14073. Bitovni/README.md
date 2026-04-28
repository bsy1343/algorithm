# [Gold I] Bitovni - 14073

[문제 링크](https://www.acmicpc.net/problem/14073)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

구현, 다이나믹 프로그래밍, 비트마스킹

### 문제 설명

<p>Zadan je niz od N nenegativnih cijelih brojeva. Potrebno je, za svaki cijeli broj K između 1 i N, pronaći najveći cijeli broj koji se može dobiti kao rezultat takozvane bitwise-OR operacije na podnizu koji sadrži K uzastopnih elemenata originalnog niza.</p>

<p>Rezultat bitwise-OR operacije na nizu nenegativnih cijelih brojeva je cijeli broj kojemu je i-ta binarna znamenka s desna jednaka nuli ako i samo ako je i-ta binarna znamenka s desna svakog od brojeva u nizu također jednaka nuli.&nbsp;</p>

### 입력

<p>Prvi redak sadrži prirodni broj N (1 &le; N &le; 500 000) - broj elemenata u nizu. Svaki od sljedećih N redaka sadrži element niza - cijeli broj x (0 &le; x &lt; 2<sup>30</sup>).&nbsp;</p>

### 출력

<p>Izlaz se treba sastojati od N redaka. U k-ti red ispi&scaron;ite najveći broj koji se može dobiti kao bitwise-OR nekog podniza uzastopnih elemenata duljine k.&nbsp;</p>