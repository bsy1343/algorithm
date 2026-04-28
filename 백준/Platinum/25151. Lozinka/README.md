# [Platinum III] Lozinka - 25151

[문제 링크](https://www.acmicpc.net/problem/25151)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Alen je nedavno otkrio topforces.edu.pl, najnoviju web stranicu sa zadacima te se odmah krenuo registrirati. Napisao je svoje ime, prezime, e-mail adresu, broj telefona, kućnu adresu, po&scaron;tanski broj, omiljenu pjesmu, veličinu majice te, naravno, lozinku i ponovljenu lozinku. Nakon &scaron;to je kliknuo na gumb za registraciju dočekala ga je sljedeća poruka:</p>

<p><em>Lozinka se mora sastojati od točno N znamenaka te se nijedan tročlani podniz lozinke ne smije sastojati od uzastopnih znamenaka u rastućem ili padajućem poretku (npr. 123, 789, 543).</em></p>

<p>Podniz nekog niza dobivamo brisanjem nekih njegovih elemenata uz očuvanje poretka neobrisanih elemenata. Primjerice, podniz (1, 3, 5) dobivamo brisanjem drugog i četvrtog elementa niza (1, 2, 3, 4, 5). Shodno definiciji, tročlani podnizovi (1, 2, 9) i (3, 3, 4) smiju se nalaziti u lozinki, dok su podnizovi (5, 6, 7) i (9, 8, 7) zabranjeni. Također, valjane lozinke smiju sadržavati vodeće nule.</p>

<p>Alen nije mogao samo tako odlučiti koju će lozinku odabrati pa je napisao program koji ispisuje ukupan broj valjanih lozinki zajedno s K-tom lozinkom po veličini koju će, u konačnici, odabrati za svoju lozinku.</p>

### 입력

<p>U prvom retku nalaze se prirodni brojevi N (1 &le; N &le; 20) i K iz teksta zadatka. Broj K neće biti veći od ukupnog broja valjanih lozinki.</p>

### 출력

<p>U prvi redak ispi&scaron;i ukupan broj lozinki, a u drugi redak ispi&scaron;i Alenovu lozinku.</p>