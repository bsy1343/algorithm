# [Gold V] Zapałki - 8685

[문제 링크](https://www.acmicpc.net/problem/8685)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 28, 맞힌 사람: 22, 정답 비율: 64.706%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Jaś ustawił w rzędzie <em>n</em>&nbsp;zapałek, jedną obok drugiej, wszystkie zwr&oacute;cone gł&oacute;wką do g&oacute;ry. Każda zapałka ma określoną wysokość <em>h<sub>i</sub></em>.</p>

<p>Jaś może podpalić jedną zapałkę, przez co zacznie się ona spalać i zmniejszać. Podczas spalania może zdarzyć się tak, że ogień przejdzie na inne zapałki. Dzieje się to zawsze wtedy, gdy ogień znajduje się na tym samym poziomie, co gł&oacute;wka sąsiedniej zapałki. Jaś chce wiedzieć, kt&oacute;rą zapałkę musi podpalić na początku, aby spłonęło ich jak najwięcej.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą liczbę zapałek. Drugi wiersz wejścia zawiera ciąg&nbsp;<em>n</em>&nbsp;liczb całkowitych <em>h</em><sub>1</sub>, <em>h</em><sub>2</sub>, ..., <em>h<sub>n</sub></em>&nbsp;(1 &le; <em>h<sub>i</sub></em> &le; 10<sup>9</sup>), gdzie&nbsp;<em>h<sub>i</sub></em>&nbsp;oznacza wysokość <em>i</em>-tej zapałki.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną maksymalnej liczbie zapałek, kt&oacute;re mogą spłonąć.</p>