# [Platinum III] Factorial Attack - 35420

[문제 링크](https://www.acmicpc.net/problem/35420)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 62, 정답: 16, 맞힌 사람: 16, 정답 비율: 29.091%

### 분류

많은 조건 분기, 백트래킹, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>필드에 $N$마리의 몬스터가 일렬로 서 있다. $i$번째 몬스터의 체력은 $h_i$이다. 당신은 필드의 모든 몬스터를 처치해야 한다. 몬스터를 처치하기 위해서는 해당 몬스터의 체력을 $0$ 이하로 만들어야 한다. 이를 위해 당신은 두 정수 $l$과 $r$ ($l \le r$)을 골라 $l$번째부터 $r$번째까지의 몬스터에게 범위 공격을 시전할 수 있다. 이 범위 공격을 맞은 몬스터는 체력이 $(N - r + l)!$만큼 감소한다.</p>

<p>모든 몬스터를 처치하기 위해 최소 몇 번의 범위 공격을 시전해야 하는지 구하시오.</p>

### 입력

<p>첫 번째 줄에 정수 $N$이 주어진다. $(1 \le N \le 500)$</p>

<p>두 번째 줄에 $h_1, h_2, \ldots, h_N$이 공백으로 구분되어 주어진다. $(1 \le h_i \le 5\,000)$</p>

### 출력

<p>첫 번째 줄에 모든 몬스터를 처치하기 위해 시전해야 하는 범위 공격의 최소 횟수를 출력한다.</p>

### 힌트

<p>$n!$은 $1$부터 $n$까지의 모든 정수를 곱한 값이다.</p>

<div class="mt-wrapper">
<h2 class="mt-title">Factorial Attack</h2>

<div class="mt-panel">
<h3>필드 설정</h3>

<div class="mt-input-group"><label for="mt-input-n">몬스터 수 (N):</label> <input class="mt-input-text mt-short" id="mt-input-n" max="500" min="1" type="number" value="5"></div>

<div class="mt-input-group"><label for="mt-input-hp">체력 배열 (공백 구분):</label> <input class="mt-input-text mt-long" id="mt-input-hp" type="text" value="10 20 30 40 50"><button class="mt-btn" id="mt-btn-load">필드 생성</button></div>
</div>

<div class="mt-stats">
<div>시전 횟수: <span id="mt-attack-count" style="color:#ef4444;">0</span>회</div>

<div>생존 몬스터: <span id="mt-alive-count">0</span> / <span id="mt-total-count">0</span>마리</div>
</div>

<div class="mt-arena" id="mt-arena"> </div>

<div class="mt-bottom-controls">
<div id="mt-preview-damage" style="font-size: 1.1em; color: #ef4444; font-weight: bold; min-height: 1.5em;">대상을 드래그하여 선택해주세요.</div>
<button class="mt-btn mt-btn-attack" disabled="disabled" id="mt-btn-execute">Attack!</button></div>
</div>