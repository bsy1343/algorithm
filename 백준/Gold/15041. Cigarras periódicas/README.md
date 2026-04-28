# [Gold III] Cigarras periódicas - 15041

[문제 링크](https://www.acmicpc.net/problem/15041)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 17, 맞힌 사람: 16, 정답 비율: 94.118%

### 분류

수학, 그리디 알고리즘, 정수론

### 문제 설명

<p>As &ldquo;cigarras peri&oacute;dicas&rdquo; americanas t&ecirc;m o ciclo de vida mais longo de todos os insetos conhecidos. A cada 17 anos, estas cigarras peri&oacute;dicas amadurecem, se acasalam, depositam ovos e morrem. Suas crias se refugiam debaixo da terra, a 20 cent&iacute;metros de profundidade, onde elas se alimentar&atilde;o da seiva de ra&iacute;zes por 17 anos, at&eacute; que chegue seu dia de buscar um lugar ao sol.</p>

<p>Acredita-se que esse n&uacute;mero n&atilde;o aconteceu por acaso, outras esp&eacute;cies de cigarras da regi&atilde;o tem ciclos de 13 anos, assim essas duas esp&eacute;cies emergem ao mesmo tempo apenas a cada 221 anos. Isso &eacute; desej&aacute;vel pois dessa forma a chance de que as duas esp&eacute;cies se misturem diminui consideravelmente e caracter&iacute;sticas indesej&aacute;veis de uma popula&ccedil;&atilde;o n&atilde;o s&atilde;o introduzidas na outra.</p>

<p>Inspirado por esse fen&circ;omeno, uma nova varia&ccedil;&atilde;o de algoritmo evolutivo foi criada. Na &uacute;ltima etapa desse algoritmo as melhores poss&iacute;veis solu&ccedil;&otilde;es s&atilde;o divididas em popula&ccedil;&otilde;es de modo que cada popula&ccedil;&atilde;o i tem um ciclo de vida C<sub>i</sub>. Al&eacute;m disso uma popula&ccedil;&atilde;o extra tamb&eacute;m &eacute; adicionada, de modo que a quantidade de itera&ccedil;&otilde;es at&eacute; que o ciclo de vida de todas as popula&ccedil;&otilde;es coincida seja a maior poss&iacute;vel. Essas popula&ccedil;&otilde;es s&atilde;o ent&atilde;o avaliadas at&eacute; que o ciclo de vida de todas coincida e a melhor solu&ccedil;&atilde;o ao final do processo &eacute; escolhida. Como n&atilde;o &eacute; interessante esperar demais at&eacute; que o algoritmo gere uma resposta, um limite superior L no n&uacute;mero de itera&ccedil;&otilde;es tamb&eacute;m deve ser respeitado.</p>

<p>Dados os ciclos de vida das popula&ccedil;&otilde;es criadas e o limite na quantidade de itera&ccedil;&otilde;es L, sua tarefa &eacute; computar qual o per&iacute;odo &oacute;timo para a popula&ccedil;&atilde;o extra que ser&aacute; adicionada.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m dois inteiros N e L, respectivamente, a quantidade de popula&ccedil;&otilde;es geradas pelas etapas anteriores do algoritmo e o limite da quantidade de itera&ccedil;&otilde;es, 2 &le; N &le; 10<sup>4</sup> , 1 &le; L &le; 10<sup>6</sup>. A linha seguinte cont&eacute;m os N valores C<sub>i</sub> representando a quantidade de itera&ccedil;&otilde;es no ciclo de vida de cada popula&ccedil;&atilde;o, onde 1 &le; C<sub>i</sub>. Voc&ecirc; pode assumir que os ciclos de vida das popula&ccedil;&otilde;es atuais coincidem em menos de L itera&ccedil;&otilde;es.</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha com um inteiro representando o per&iacute;odo da popula&ccedil;&atilde;o extra que maximiza a quantidade T de itera&ccedil;&otilde;es at&eacute; que os ciclos de vida de todas as popula&ccedil;&otilde;es coincidam, respeitando a restri&ccedil;&atilde;o de que T &le; L. Caso exista mais de um valor poss&iacute;vel imprima o menor deles.</p>