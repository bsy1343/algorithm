# [Bronze II] Enigma - 16446

[문제 링크](https://www.acmicpc.net/problem/16446)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 150, 정답: 120, 맞힌 사람: 108, 정답 비율: 80.597%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>Dada uma configura&ccedil;&atilde;o inicial, a m&aacute;quina de criptografia alem&atilde; Enigma, da Segunda Guerra Mundial, substitu&iacute;a cada letra digitada no teclado por alguma outra letra. A substitui&ccedil;&atilde;o era bastante complexa, mas a m&aacute;quina tinha uma vulnerabilidade: uma letra nunca seria substitu&iacute;da por ela mesma! Essa vulnerabilidade foi explorada por Alan Turing, que trabalhou na criptoan&aacute;lise da Enigma durante a guerra. O objetivo era encontrar a configura&ccedil;&atilde;o inicial da m&aacute;quina usando a suposi&ccedil;&atilde;o de que a mensagem continha uma certa express&atilde;o usual da comunica&ccedil;&atilde;o, como por exemplo a palavra <code>ARMADA</code>. Essas express&otilde;es eram chamadas de cribs. Se a mensagem cifrada era, por exemplo, <code>FDMLCRDMRALF</code>, o trabalho de testar as poss&iacute;veis configura&ccedil;&otilde;es da m&aacute;quina era simplificado porque a palavra <code>ARMADA</code>, se estivesse nessa mensagem cifrada, s&oacute; poderia estar em duas posi&ccedil;&otilde;es, ilustradas na tabela abaixo com uma seta. As demais cinco posi&ccedil;&otilde;es n&atilde;o poderiam corresponder ao crib <code>ARMADA</code> porque ao menos uma letra do crib, sublinhada na tabela abaixo, casa com sua correspondente na mensagem cifrada; como a Enigma nunca substituiria uma letra por ela pr&oacute;pria, essas cinco posi&ccedil;&otilde;es poderiam ser descartadas nos testes.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/575b8599-d3c3-44db-a5c5-8d011ac8546b/-/preview/" style="width: 308px; height: 164px;" /></p>

<p>Neste problema, dada uma mensagem cifrada e um crib, seu programa deve computar o n&uacute;mero de posi&ccedil;&otilde;es poss&iacute;veis para o crib na mensagem cifrada.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m a mensagem cifrada, que &eacute; uma sequ&ecirc;ncia de pelo menos uma letra e no m&aacute;ximo 10<sup>4</sup> letras. A segunda linha da entrada cont&eacute;m o crib, que &eacute; uma sequ&ecirc;ncia de pelo menos uma letra e no m&aacute;ximo o mesmo n&uacute;mero de letras da mensagem. Apenas as 26 letras mai&uacute;sculas, sem acentua&ccedil;&atilde;o, aparecem na mensagem e no crib.</p>

### 출력

<p>Imprima uma linha contendo um inteiro, indicando o n&uacute;mero de posi&ccedil;&otilde;es poss&iacute;veis para o crib na mensagem cifrada.</p>