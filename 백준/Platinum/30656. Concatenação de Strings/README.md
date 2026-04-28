# [Platinum V] Concatenação de Strings - 30656

[문제 링크](https://www.acmicpc.net/problem/30656)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 74, 정답: 24, 맞힌 사람: 22, 정답 비율: 37.288%

### 분류

수학, 문자열, 정수론, KMP

### 문제 설명

<p>Seja s uma string. Denotamos por s<sup>n</sup> a concatenação de n cópias de s. Por exemplo, se s = &ldquo;eri&rdquo; e n = 3, temos s<sup>3</sup> = &ldquo;erierieri&rdquo;.</p>

<p>Dadas strings r e s, sua tarefa é determinar se existem inteiros m e n tais que r<sup>m</sup> = s<sup>n</sup>.</p>

### 입력

<p>Cada linha da entrada conterá duas strings, separadas por um espaço, compostas apenas por letras minúsculas. Cada uma das strings terá pelo menos 1 e no máximo 1.000.000 caracteres. A última linha da entrada será composta por duas strings &ldquo;#&rsquo; separadas por espaço. Esta linha não deve ser processada.</p>

### 출력

<p>Para cada linha da entrada, você deve gerar uma linha de saída contendo os menores inteiros m e n separados por espaço caso tais inteiros existam, e &ldquo;NAO&rdquo;, em caso contrário.</p>