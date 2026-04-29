# [Gold III] Dim - 34601

[문제 링크](https://www.acmicpc.net/problem/34601)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 5, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 수학, 조합론

### 문제 설명

<p>Permutacija je niz od $N$ elemenata koji čine međusobno različiti prirodni brojevi od $1$ do $N$, gdje je $N$ prirodni broj. Uz pojam permutacije, definiramo pojam <em>dimice</em>.</p>

<p>Par uzastopnih elemenata permutacije takvih da je lijevi element tj. onaj element koji se prije pojavljuje u permutaciji veći od desnog elementa. Npr. permutacija $[2, 5, 4, 1, 6, 3]$ ima $3$ dimice: $(5, 4)$, $(4, 1)$ i $(6, 3)$.</p>

<p>Marko jako voli permutacije. Izabrao je broj $N$, duljinu permutacije, i broj $K$, broj dimica u permutaciji.</p>

<p>Želi zapisati sve permutacije duljine $N$ koje imaju točno $K$ dimica, ali htio bih znati koliko uopće ima takvih permutacija. Pomognite Marku i odgovorite mu na pitanje.</p>

### 입력

<p>U prvom retku se nalaze nenegativni cijeli brojevi $N$ i $K$ ($1 ≤ N ≤ 5000$, $0 ≤ K ≤ N - 1$).</p>

### 출력

<p>U prvi i jedini redak, ispišite cijeli broj, ostatak pri dijeljenju odgovora na pitanje s $10^9 + 7$.</p>

### 힌트

<p>Opis drugog probnog primjera: Permutacije duljine četiri koje imaju dvije dimice su sljedeće: $[1, 2, 4, 3]$, $[1, 3, 2, 4]$, $[1, 3, 4, 2]$, $[1, 4, 2, 3]$, $[2, 1, 3, 4]$, $[2, 3, 1, 4]$, $[2, 3, 4, 1]$, $[2, 4, 1, 3]$, $[3, 1, 2, 4]$, $[3, 4, 1, 2]$, $[4, 1, 2, 3]$</p>