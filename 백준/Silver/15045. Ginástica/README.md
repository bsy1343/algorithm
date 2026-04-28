# [Silver III] Ginástica - 15045

[문제 링크](https://www.acmicpc.net/problem/15045)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 32, 맞힌 사람: 30, 정답 비율: 96.774%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Vin&iacute;cius gosta muito de se exercitar na academia de gin&aacute;stica. Ele fez um acordo com o seu treinador para ter programas de exerc&iacute;cios diferentes a cada vez que usar a bicicleta ergom&eacute;trica. Um programa, na linguagem das academias, &eacute; uma sequ&ecirc;ncia de n&iacute;veis de dificuldade do exerc&iacute;cio. Os programas de Vin&iacute;cius para a bicicleta ergom&eacute;trica devem ter a mesma dura&ccedil;&atilde;o em minutos e os n&iacute;veis de dificuldade devem mudar a cada minuto, para um n&iacute;vel imediatamente acima ou um n&iacute;vel imediatamente abaixo. Os n&iacute;veis de dificuldade n&atilde;o podem estar abaixo de um m&iacute;nimo e nem acima de um m&aacute;ximo previamente estipulados.</p>

<p>Seu problema &eacute; calcular o n&uacute;mero de programas diferentes que o treinador pode construir, obedecidas as restri&ccedil;&otilde;es acima.</p>

### 입력

<p>A entrada consiste de uma &uacute;nica linha que cont&eacute;m tr&ecirc;s inteiros, T, M, N (1 &le; T &le; 50, 1 &le; M &lt; N &le; 10<sup>5</sup>) em que T &eacute; o n&uacute;mero de minutos do exerc&iacute;cio, M &eacute; o valor m&iacute;nimo de dificuldade permitido e N &eacute; o valor m&aacute;ximo de dificuldade permitido.</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha com um inteiro representando o n&uacute;mero de programas diferentes que o treinador pode construir. Como esse n&uacute;mero pode ser grande, a resposta deve ser esse n&uacute;mero m&oacute;dulo 10<sup>9</sup> + 7.</p>