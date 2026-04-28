# [Silver II] Stipe - 25164

[문제 링크](https://www.acmicpc.net/problem/25164)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 16, 맞힌 사람: 14, 정답 비율: 50.000%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>U redu za cijepljenje stoji N ljudi. Za svaku osobu u redu znamo koliko je stara. Kada redar Stipe vikne Sljedeći!, istupi osoba koja je prva na redu. Na Stipi je tada ili da je propusti na cijepljenje, ili da joj kaže da dođe drugi put.</p>

<p>Doza cjepiva ima ograničeno, njih K, a Stipe će se pobrinuti da se sve iskoriste. Nakon &scaron;to je cijepljeno K ljudi, Stipe će objaviti kako cjepiva vi&scaron;e nema i ostatak ljudi koji stoji u redu poslati kućama.</p>

<p>Za Stipu bi sve bilo jednostavno, kada ne bi postojala opasnost da portali na kraju dana objave vijest: Cijepili mlađeg, a starijeg ne! Kako do toga ne bi do&scaron;lo, Stipe će paziti da ne postoji nijedan par osoba (X, Y), tako da je osoba X cijepljena, osoba Y ne, a osoba X mlađa je od osobe Y.</p>

<p>Osim toga, Stipe će paziti i da broj ljudi koje po&scaron;alje kući dok cjepiva jo&scaron; ima, tj. prije nego &scaron;to je zadnja osoba cijepljena, bude minimalan. Koliko će ljudi Stipe poslati kući dok cjepiva jo&scaron; ima?</p>

### 입력

<p>U prvom su retku prirodni brojevi N (1 &le; N &le; 100 000) i K (1 &le; K &le; N).</p>

<p>U sljedećih N redaka su po tri nenegativna cijela broja G (0 &le; G &le; 99), M (0 &le; M &le; 11) i D (0 &le; D &le; 29), starost osoba u redu, redom od prve do posljednje, izražena u godinama, mjesecima i danima.</p>

### 출력

<p>U prvi i jedini redak ispi&scaron;i koliko će ljudi Stipe poslati kući dok cjepiva jo&scaron; ima.</p>

### 힌트

<p>Opis prvog probnog primjera: Cijepit će se prva i druga osoba, a treća će osoba biti poslana kući zbog nestanka cjepiva. Nijedna osoba neće biti poslana kući dok cjepiva jo&scaron; ima.</p>

<p>Opis drugog probnog primjera: Cijepit će se samo treća osoba, a prve će dvije osobe biti poslane kući dok cjepiva jo&scaron; ima.</p>

<p>Opis trećeg probnog primjera: Cijepit će se prva i treća osoba, a druga i četvrta osoba bit će poslane kući, no samo druga dok cjepiva jo&scaron; ima. Četvrta će osoba biti poslana kući zbog nestanka cjepiva.</p>